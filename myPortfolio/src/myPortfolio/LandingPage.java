package myPortfolio;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class LandingPage {

	JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage window = new LandingPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LandingPage() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Welcome");
		frame.setSize(814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Sets Basic Information button
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
		faqInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				FAQsPage FP = new FAQsPage();
				FP.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		faqInf.setBounds(651, 554, 89, 33);
		frame.getContentPane().add(faqInf);
		
		ImageIcon backIcon = new ImageIcon(getClass().getResource("/left.png"));
		JLabel backBtn = new JLabel();
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				WelcomePage WP = new WelcomePage();
				WP.frame.setVisible(true);
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
		
		ImageIcon pic = new ImageIcon (getClass().getResource("/hello.png"));
		JLabel backgroundPic = new JLabel("");
		backgroundPic.setBounds(0, 0, 800, 600);
		backgroundPic.setIcon(pic);
		frame.getContentPane().add(backgroundPic);
		
		
    }
}
