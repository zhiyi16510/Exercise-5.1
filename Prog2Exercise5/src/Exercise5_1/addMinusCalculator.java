package Exercise5_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addMinusCalculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMinusCalculator window = new addMinusCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addMinusCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 621, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(103, 58, 143, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setBounds(367, 58, 143, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int ans=0;
				int[] num = new int[2];
				try {
					num[0] = Integer.parseInt(textField.getText());
					num[1] = Integer.parseInt(textField_1.getText());
					for(int i=0; i<num.length; i++) {
						ans = ans+num[i];
					}
					
					//ans = num1+num2;
					textField_2.setText(Integer.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,  "Please enter a valid number.");
				}
			}
		});
		btnNewButton.setBounds(166, 144, 102, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans=0;
				int[] num = new int[2];
				try {num[0] = Integer.parseInt(textField.getText());
					num[1] = Integer.parseInt(textField_1.getText());
					
					for(int i=0; i<num.length; i++) {
						ans = num[0]-num[1];
					}
				
					//ans = num1-num2-num3;
					textField_2.setText(Integer.toString(ans));
			} catch(Exception e1) {
				JOptionPane.showMessageDialog(null,  "Please enter a valid number.");
						
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(344, 144, 102, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setBounds(258, 238, 158, 50);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(88, 244, 158, 33);
		frame.getContentPane().add(lblNewLabel);
	}

}
