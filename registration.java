package finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class registration {

	private JFrame frameregister;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void registrationpage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frameregister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameregister = new JFrame();
		frameregister.getContentPane().setBackground(new Color(255, 255, 255));
		frameregister.setBounds(100, 100, 427, 690);
		frameregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameregister.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Password");
		lblNewLabel_3_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_1_1_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(45, 472, 275, 30);
		frameregister.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Username");
		lblNewLabel_3_1_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_3_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_1_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(45, 398, 275, 30);
		frameregister.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Full Name");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(45, 328, 275, 30);
		frameregister.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile number or Email");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3.setBounds(45, 261, 275, 30);
		frameregister.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(45, 282, 318, 46);
		frameregister.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 105028.png"));
		lblNewLabel.setBounds(75, 30, 257, 74);
		frameregister.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sign up to see photos and videos ");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 23));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(45, 114, 330, 29);
		frameregister.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" from your friends.");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(33, 137, 330, 29);
		frameregister.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.facebook.com/"));
				}
				catch(IOException err) {
				}
				catch(URISyntaxException err) {
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 130037.png"));
		btnNewButton.setBounds(45, 177, 313, 31);
		frameregister.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("_______________ Or _______________");
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(45, 223, 300, 29);
		frameregister.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 351, 318, 46);
		frameregister.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 423, 318, 46);
		frameregister.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(45, 492, 318, 46);
		frameregister.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("People who use our service may have uploaded");
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(12, 548, 363, 29);
		frameregister.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("your contact information to Instagram.");
		lblNewLabel_1_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.GRAY);
		lblNewLabel_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(12, 565, 363, 29);
		frameregister.getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 132745.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registration2 nw = new registration2();
				nw.registrationpage2();
				frameregister.dispose();
			}
		});
		btnNewButton_1.setBounds(40, 598, 323, 30);
		frameregister.getContentPane().add(btnNewButton_1);
	}
}
