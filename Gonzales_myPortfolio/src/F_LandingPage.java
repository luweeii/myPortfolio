import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class F_LandingPage {
	T1_LandingPage text = new T1_LandingPage();
	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_LandingPage window = new F_LandingPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_LandingPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Introduction");
		frame.setSize (814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Basic Information button
		Menu bscInf = new Menu ("<html><center>Basic</center><center>Information</center></html>");
		bscInf.setFont(new Font("Open Sans", Font.BOLD, 15));
		bscInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				F_BasicInformation BIP = new F_BasicInformation();
				BIP.frame.setVisible(true);
				frame.dispose();
			}	
		});
		bscInf.setBounds(44, 554, 129, 33);
		frame.getContentPane().add(bscInf);
		
		//Set Hobbies button
		Menu hbyInf = new Menu ("Hobbies");
		hbyInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				F_HobbyPage HP = new F_HobbyPage();
				HP.frame.setVisible(true);
				frame.dispose();
			}
		});
		hbyInf.setBounds(255, 553, 89, 33);
		frame.getContentPane().add(hbyInf);
		
		//Set Talents & Achievements Button
		Menu talentInf = new Menu ("<html><center>Talents &</center><center>Achievements</center></html>");
		talentInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				F_TalentsAchievementsPage TAP = new F_TalentsAchievementsPage();
				TAP.frame.setVisible(true);
				frame.dispose();
			}
		});
		talentInf.setBounds(417, 554, 164, 35);
		frame.getContentPane().add(talentInf);
		
		//Set Education and Skills button
		Menu educskillInf = new Menu ("<html><center>Education &</center><center>Skills</center></html>");
		educskillInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				F_EducSkills FP = new F_EducSkills();
				FP.frame.setVisible(true);
				frame.dispose();
			}
		});
		educskillInf.setBounds(623, 545, 142, 53);
		frame.getContentPane().add(educskillInf);
		
		JPanel bgPanel = new JPanel();
		bgPanel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(bgPanel);
		bgPanel.setLayout(null);
		
		//Set Back Icon
		ImageIcon backIcon = new ImageIcon(getClass().getResource("/angle-left.png"));
		Image img = backIcon.getImage();
		JLabel backBtn = new JLabel("");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				F_Welcome wc = new F_Welcome();
				wc.frame.setVisible(true);
			}
		});
		
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setBounds(10, 11, 21, 21);
		Image newImg = img.getScaledInstance(backBtn.getWidth(), backBtn.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledImg = new ImageIcon(newImg);
		backBtn.setIcon(scaledImg);
		bgPanel.add(backBtn);
		
		/*Inherits summary, contact, email, facebook, and instagram String
		from T1_LandingPage.java - (Parent Class)*/
		JLabel summary = new JLabel(text.summary);
		summary.setFont(new Font("Open Sans", Font.BOLD, 19));
		summary.setForeground(Color.black);
		summary.setBounds(86, 306, 634, 141);
		bgPanel.add(summary);
		
		JLabel contactNo = new JLabel(text.contact);
		contactNo.setFont(new Font("Open Sans", Font.PLAIN, 12));
		contactNo.setForeground(Color.black);
		contactNo.setBounds(86, 457, 177, 21);
		bgPanel.add(contactNo);
		
		JLabel email = new JLabel(text.email);
		email.setForeground(Color.BLACK);
		email.setFont(new Font("Open Sans", Font.PLAIN, 12));
		email.setBounds(86, 481, 177, 21);
		bgPanel.add(email);
		
		JLabel facebook = new JLabel(text.fb);
		facebook.setForeground(Color.BLACK);
		facebook.setFont(new Font("Open Sans", Font.PLAIN, 12));
		facebook.setBounds(509, 457, 235, 21);
		bgPanel.add(facebook);
		
		JLabel instagram = new JLabel(text.ig);
		instagram.setForeground(Color.BLACK);
		instagram.setFont(new Font("Open Sans", Font.PLAIN, 12));
		instagram.setBounds(509, 481, 177, 21);
		bgPanel.add(instagram);
		//END INHERITANCE
		
		//Set Landing Page background
		ImageIcon landingpageBG = new ImageIcon(getClass().getResource("/landing page.png"));
		JLabel landingpageBGImage = new JLabel();
		landingpageBGImage.setBounds(0, 0, 800, 600);
		landingpageBGImage.setIcon(landingpageBG);
		bgPanel.add(landingpageBGImage);
	}
}
