import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class F_TalentsAchievementsPage {
	T4_TalentsAchievements talents_achievements = new T5_EducSkills();
	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_TalentsAchievementsPage window = new F_TalentsAchievementsPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_TalentsAchievementsPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Talents and Achievements");
		frame.setSize(814, 636);
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
		
		//Disable Talents & Achievements Button
		Menu talentInf = new Menu ("<html><center>Talents &</center><center>Achievements</center></html>");
		talentInf.removeMouseListener(talentInf.getMouseListeners()[0]);
		talentInf.setForeground(new Color(115, 115, 115));
		talentInf.setBounds(417, 554, 164, 35);
		frame.getContentPane().add(talentInf);
		
		JPanel bgPanel = new JPanel();
		bgPanel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(bgPanel);
		bgPanel.setLayout(null);		

		//Set Back Icon
		Menu back = new Menu("");
		JLabel backBtn = back.setupBackButton(bgPanel);
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				F_LandingPage LP = new F_LandingPage();
				LP.frame.setVisible(true);
			}
		});

		//Set Hobby Page background
		ImageIcon talentsachievementsBG = new ImageIcon(getClass().getResource("talents and achievements.png"));
		
		//Inherits talents and achievements string from T4_TalentsAchievements.java - (subclass)
		JLabel talent1 = new JLabel(talents_achievements.talent1);
		talent1.setFont(new Font("Open Sans", Font.BOLD, 14));
		talent1.setHorizontalAlignment(SwingConstants.CENTER);
		talent1.setBounds(133, 265, 124, 21);
		talent1.setForeground(Color.black);
		bgPanel.add(talent1);
		
		JLabel talent2 = new JLabel(talents_achievements.talent2);
		talent2.setFont(new Font("Open Sans", Font.BOLD, 14));
		talent2.setHorizontalAlignment(SwingConstants.CENTER);
		talent2.setBounds(143, 460, 111, 20);
		talent2.setForeground(Color.black);
		bgPanel.add(talent2);
		
		JLabel achievement1 = new JLabel(talents_achievements.achievement1);
		achievement1.setFont(new Font("Open Sans", Font.BOLD, 14));
		achievement1.setHorizontalAlignment(SwingConstants.CENTER);
		achievement1.setBounds(540, 231, 129, 60);
		achievement1.setForeground(Color.black);
		bgPanel.add(achievement1);
		
		JLabel achievement2 = new JLabel(talents_achievements.achievement2);
		achievement2.setFont(new Font("Open Sans", Font.BOLD, 14));
		achievement2.setHorizontalAlignment(SwingConstants.CENTER);
		achievement2.setBounds(540, 443, 129, 35);
		achievement2.setForeground(Color.black);
		bgPanel.add(achievement2);
		
		//Set Education and Skills button
		Menu educskillInf = new Menu ("<html><center>Education &</center><center>Skills</center></html>");
		bgPanel.add(educskillInf);
		educskillInf.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				F_EducSkills FP = new F_EducSkills();
				FP.frame.setVisible(true);
				frame.dispose();
			}
		});
		educskillInf.setBounds(623, 545, 142, 53);
		
		JLabel talentsavhievementsBGImage = new JLabel();
		talentsavhievementsBGImage.setBounds(0, 0, 800, 600);
		talentsavhievementsBGImage.setIcon(talentsachievementsBG);
		bgPanel.add(talentsavhievementsBGImage);
	}

}
