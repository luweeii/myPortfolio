import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class F_Welcome {

	JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Welcome window = new F_Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_Welcome() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("My Portfolio");
		frame.setSize(814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel bgPanel = new JPanel();
		bgPanel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(bgPanel);
		bgPanel.setLayout(null);
		
		
		JPanel startPanel = new JPanel();
		startPanel.setBounds(45, 499, 89, 36);
		bgPanel.add(startPanel);
		startPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel startBtn = new JLabel("START");
		startBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		startBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				F_LandingPage LP = new F_LandingPage();
				LP.frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				startBtn.setForeground(new Color(0, 179, 107));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startBtn.setForeground(Color.black);
			}
		});
		startBtn.setFont(new Font("Libre Baskerville", Font.BOLD, 20));
		startPanel.add(startBtn);
		ImageIcon welcomeBG = new ImageIcon(getClass().getResource("/welcome page.png"));
		JLabel welcomeBGImage = new JLabel();
		welcomeBGImage.setBounds(0, 0, 800, 600);
		welcomeBGImage.setIcon(welcomeBG);
		bgPanel.add(welcomeBGImage);
	}
}
