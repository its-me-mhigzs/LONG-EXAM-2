package finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class forgot {

	private JFrame forgotframe;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void passwordforgot() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgot window = new forgot();
					window.forgotframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public forgot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		forgotframe = new JFrame();
		forgotframe.getContentPane().setBackground(new Color(255, 255, 255));
		forgotframe.setBounds(100, 100, 630, 402);
		forgotframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		forgotframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 105028.png"));
		lblNewLabel.setBounds(171, 20, 267, 76);
		forgotframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter new password:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(81, 106, 435, 34);
		forgotframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Re-enter password:");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(81, 183, 435, 34);
		forgotframe.getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(81, 134, 435, 39);
		forgotframe.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(81, 211, 435, 39);
		forgotframe.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must enter a Password!");
					} 
					else if(passwordField_1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "You must Re-Enter Password!");
					}
				else {
						tuition nw = new tuition();
						nw.tuitionpage();
						forgotframe.dispose();
					}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.setBounds(193, 277, 212, 34);
		forgotframe.getContentPane().add(btnNewButton);
	}

}
