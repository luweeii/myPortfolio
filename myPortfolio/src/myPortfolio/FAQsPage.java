package myPortfolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FAQsPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQsPage window = new FAQsPage();
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
	public FAQsPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("FAQs");
		frame.setSize(814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Menu bscInf = new Menu ("<html><center>Basic</center><center>Information</center></html>");
		bscInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				BasicInformation BIP = new BasicInformation();
				BIP.frame.setVisible(true);
				frame.dispose();
			}	
		});
		bscInf.setBounds(44, 554, 129, 33);
		frame.getContentPane().add(bscInf);
		
		//Sets Hobbies button
		Menu hbyInf = new Menu ("Hobbies");
		hbyInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				HobbyPage HP = new HobbyPage();
				HP.frame.setVisible(true);
				frame.dispose();
			}					
		});
		hbyInf.setBounds(255, 553, 89, 33);
		frame.getContentPane().add(hbyInf);
		
		//Sets Talents & Achievements Button
		Menu talentInf = new Menu ("<html><center>Talents &</center><center>Achievements</center></html>");
		talentInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				TalentsAchievementsPage TAP = new TalentsAchievementsPage();
				TAP.frame.setVisible(true);
				frame.dispose();
			}
		});
		talentInf.setBounds(417, 554, 164, 35);
		frame.getContentPane().add(talentInf);
		
		//Sets FAQs button
		Menu faqInf = new Menu ("FAQs");
		faqInf.removeMouseListener(faqInf.getMouseListeners()[0]);
		faqInf.setForeground(new Color(115, 115, 115));
		faqInf.setBounds(651, 554, 89, 33);
		frame.getContentPane().add(faqInf);
		
		ImageIcon backIcon = new ImageIcon(getClass().getResource("/left.png"));
		JLabel backBtn = new JLabel();
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				LandingPage LP = new LandingPage();
				LP.frame.setVisible(true);
			}
		});
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image img = backIcon.getImage();
		backBtn.setBounds(24, 18, 50, 30);
		Image newImg = img.getScaledInstance(backBtn.getWidth(), backBtn.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledBackBtn = new ImageIcon(newImg);
		backBtn.setIcon(scaledBackBtn);
		frame.getContentPane().add(backBtn);
		backBtn.setBackground(Color.BLACK);
		
		ImageIcon pic = new ImageIcon (getClass().getResource("/blank template.png"));
		JLabel backgroundPic = new JLabel("");
		backgroundPic.setBounds(0, 0, 800, 600);
		backgroundPic.setIcon(pic);
		frame.getContentPane().add(backgroundPic);
	}

}
