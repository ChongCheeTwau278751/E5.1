package Exe5_1;
import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 887, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBackground(Color.RED);
		textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNum1.setBounds(235, 52, 183, 81);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBackground(Color.RED);
		textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNum2.setBounds(430, 52, 177, 81);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//double num1, num2, num3, ans;
				double ans = 0;
				double[] num = new double[2];
				try {
					num[0] = Double.parseDouble(textFieldNum1.getText());
					num[1] = Double.parseDouble(textFieldNum2.getText());
					for(int i=0; i<num.length; i++) {
						ans = ans + num[i];
					}
					
					//ans = num1 + num2 + num3;
					textFieldAns.setText(Double.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				
			}
			}
		
		});
		btnNewButton.setBounds(189, 146, 227, 92);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//double num1, num2, num3, ans;
				double ans = 0;
				double[] num = new double[2];
				try {
					num[0] = Double.parseDouble(textFieldNum1.getText());
					num[1] = Double.parseDouble(textFieldNum2.getText());
					for(int i=0; i<num.length; i++) {
						//ans = ans - num[i];
						ans = num[0] - num[1];
					}
					
					//ans = num1 - num2 - num3;
					textFieldAns.setText(Double.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(428, 146, 227, 92);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBackground(Color.PINK);
		textFieldAns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAns.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldAns.setText("");
		textFieldAns.setBounds(329, 251, 390, 70);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("The Answer is");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_2.setBounds(95, 251, 223, 70);
		frame.getContentPane().add(btnNewButton_2);
	}
}
