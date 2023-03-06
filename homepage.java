package finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;

public class tuition {

	private JFrame frametuition;

	/**
	 * Launch the application.
	 */
	public static void tuitionpage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tuition window = new tuition();
					window.frametuition.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tuition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frametuition = new JFrame();
		frametuition.getContentPane().setForeground(new Color(255, 255, 255));
		frametuition.setBounds(100, 100, 464, 741);
		frametuition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frametuition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Miguel\\Pictures\\Screenshots\\Screenshot 2023-03-06 151727.png"));
		lblNewLabel.setBounds(0, 0, 455, 774);
		frametuition.getContentPane().add(lblNewLabel);
	}

}
