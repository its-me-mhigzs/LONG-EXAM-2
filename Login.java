package finals;

import java.awt.Color;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frameLogin;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frameLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(568, 267, 250, 25);
		frameLogin.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(568, 183, 316, 25);
		frameLogin.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setToolTipText("");
		username.setFont(new Font("Georgia", Font.PLAIN, 16));
		username.setBounds(568, 213, 347, 44);
		frameLogin.getContentPane().add(username);
		username.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
				      password.setEchoChar((char)0); //password = JPasswordField
				   } else {
					   password.setEchoChar('\u25cf');
				   }
			}
		});
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 19));
		password.setBounds(568, 296, 347, 44);
		frameLogin.getContentPane().add(password);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Calibri", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(568, 365, 162, 21);
		frameLogin.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnSignUp = new JButton("");
		btnSignUp.addActionListener(new ActionListener() {
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
		btnSignUp.setBackground(new Color(255, 255, 255));
		btnSignUp.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 120253.png"));
		btnSignUp.setForeground(new Color(0, 0, 128));
		btnSignUp.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSignUp.setBounds(650, 483, 208, 25);
		frameLogin.getContentPane().add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 105028.png"));
		lblNewLabel.setBounds(601, 86, 257, 100);
		frameLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 105342.png"));
		lblNewLabel_2.setBounds(115, 45, 389, 606);
		frameLogin.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(username.getText().equals("admin1") && password.getText().equals("password1")){
					tuition nw = new tuition();
					nw.tuitionpage();
					frameLogin.dispose();
				} else if(username.getText().equals("admin2")&& password.getText().equals("password2")){
					tuition nw = new tuition();
					nw.tuitionpage();
					frameLogin.dispose();
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Credentials");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 115143.png"));
		btnNewButton.setBounds(588, 408, 316, 31);
		frameLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("_________________ Or _________________");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(568, 442, 347, 44);
		frameLogin.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Forgot Password?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forgot nw = new forgot();
				nw.passwordforgot();
				frameLogin.dispose();
			}
		});
		btnNewButton_1.setBounds(683, 518, 139, 21);
		frameLogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Dont Have an account?");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(639, 549, 139, 27);
		frameLogin.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Sign Up");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registration nw = new registration();
				nw.registrationpage();
				frameLogin.dispose();
			}
		});
		btnNewButton_2.setBounds(773, 550, 85, 21);
		frameLogin.getContentPane().add(btnNewButton_2);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setVerticalAlignment(SwingConstants.TOP);
		chckbxRememberMe.setForeground(Color.BLACK);
		chckbxRememberMe.setFont(new Font("Calibri", Font.PLAIN, 15));
		chckbxRememberMe.setBackground(Color.WHITE);
		chckbxRememberMe.setBounds(731, 365, 162, 21);

		frameLogin.getContentPane().add(chckbxRememberMe);
		frameLogin.setBounds(100, 100, 1050, 751);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
