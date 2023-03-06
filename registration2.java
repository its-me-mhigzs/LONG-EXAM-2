package finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class registration2 {

	private JFrame frameregister2;

	/**
	 * Launch the application.
	 */
	public static void registrationpage2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration2 window = new registration2();
					window.frameregister2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameregister2 = new JFrame();
		frameregister2.getContentPane().setBackground(new Color(255, 255, 255));
		frameregister2.setBounds(100, 100, 471, 277);
		frameregister2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameregister2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up Complete");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 124, 360, 38);
		frameregister2.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuition nw = new tuition();
				nw.tuitionpage();
				frameregister2.dispose();
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setBounds(137, 184, 164, 33);
		frameregister2.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 105028.png"));
		lblNewLabel_1.setBounds(93, 28, 275, 93);
		frameregister2.getContentPane().add(lblNewLabel_1);
	}

}
