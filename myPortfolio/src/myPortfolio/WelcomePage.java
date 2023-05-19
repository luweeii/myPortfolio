package myPortfolio;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomePage  {

	 JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomePage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Introduction");
		frame.setResizable(false);
		frame.setSize(814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel startBtn = new JLabel("START");
		startBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startBtn.setForeground(new Color(0, 204, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startBtn.setForeground(Color.black);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				LandingPage LP = new LandingPage();
				LP.frame.setVisible(true);
			}
		});
		startBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		startBtn.setHorizontalAlignment(SwingConstants.CENTER);
		startBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		startBtn.setBounds(43, 478, 90, 78);
		frame.getContentPane().add(startBtn);
		
		ImageIcon pic = new ImageIcon(getClass().getResource("/start.png"));
		JLabel backgroundPic = new JLabel();
//		Image img = pic.getImage();
		backgroundPic.setBounds(0, 0, 800, 600);
//		Image newImg = img.getScaledInstance(backgroundPic.getWidth(), backgroundPic.getHeight(), Image.SCALE_SMOOTH);
//		ImageIcon scaledBgImg = new ImageIcon(newImg);
//		backgroundPic.setIcon(scaledBgImg);
		backgroundPic.setIcon(pic);
		frame.getContentPane().add(backgroundPic);
	}

}
