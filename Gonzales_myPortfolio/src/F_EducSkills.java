import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_EducSkills {
	T5_EducSkills educSkill = new T5_EducSkills();
	JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_EducSkills window = new F_EducSkills();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_EducSkills() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Education and Skills");
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
		
		//Disable Education and Skills button
		Menu educskillInf = new Menu ("<html><center>Education &</center><center>Skills</center></html>");
		educskillInf.removeMouseListener(educskillInf.getMouseListeners()[0]);
		educskillInf.setForeground(new Color(115, 115, 115));
		educskillInf.setBounds(623, 545, 142, 53);
		frame.getContentPane().add(educskillInf);
		
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
		ImageIcon educskillsBG = new ImageIcon(getClass().getResource("education and skills.png"));
		
		//Inherits Education and Skills strings from T5_EducSkills.java - (subclass)
		JLabel jhsLbl = new JLabel(educSkill.jhs);
		jhsLbl.setForeground(new Color(0, 0, 0));
		jhsLbl.setFont(new Font("Open Sans", Font.PLAIN, 20));
		jhsLbl.setForeground(Color.black);
		jhsLbl.setBounds(82, 137, 188, 40);
		bgPanel.add(jhsLbl);
		
		JLabel jhsYear_School = new JLabel(educSkill.jhsYear_School);
		jhsYear_School.setFont(new Font("Open Sans", Font.PLAIN, 15));
		jhsYear_School.setForeground(Color.black);
		jhsYear_School.setBounds(34, 165, 314, 78);
		bgPanel.add(jhsYear_School);
		
		JLabel shsLbl = new JLabel(educSkill.shs);
		shsLbl.setForeground(Color.BLACK);
		shsLbl.setFont(new Font("Open Sans", Font.PLAIN, 20));
		shsLbl.setBounds(82, 265, 188, 40);
		bgPanel.add(shsLbl);
		
		JLabel shsYear_School = new JLabel(educSkill.shsYear_School);
		shsYear_School.setForeground(Color.BLACK);
		shsYear_School.setFont(new Font("Open Sans", Font.PLAIN, 15));
		shsYear_School.setBounds(34, 281, 314, 78);
		bgPanel.add(shsYear_School);
		
		JLabel college = new JLabel(educSkill.college);
		college.setForeground(Color.BLACK);
		college.setFont(new Font("Open Sans", Font.PLAIN, 20));
		college.setBounds(82, 370, 188, 40);
		bgPanel.add(college);
		
		JLabel collegeYear_School = new JLabel(educSkill.collegeYear_School);
		collegeYear_School.setForeground(Color.BLACK);
		collegeYear_School.setFont(new Font("Open Sans", Font.PLAIN, 15));
		collegeYear_School.setBounds(34, 394, 392, 78);
		bgPanel.add(collegeYear_School);
		
		JLabel adobePP = new JLabel(educSkill.adobePP);
		adobePP.setFont(new Font("Open Sans", Font.BOLD, 20));
		adobePP.setBounds(425, 140, 251, 35);
		adobePP.setForeground(Color.black);
		bgPanel.add(adobePP);
		
		JLabel adobePP_rate = new JLabel("8/10");
		adobePP_rate.setFont(new Font("Open Sans", Font.PLAIN, 15));
		adobePP_rate.setBounds(482, 183, 92, 19);
		adobePP.setForeground(Color.black);
		bgPanel.add(adobePP_rate);
		
		JLabel adobeLR = new JLabel(educSkill.adobeLR);
		adobeLR.setFont(new Font("Open Sans", Font.BOLD, 20));
		adobeLR.setBounds(425, 233, 251, 35);
		adobePP.setForeground(Color.black);
		bgPanel.add(adobeLR);
		
		JLabel adobeLR_rate = new JLabel("7/10");
		adobeLR_rate.setFont(new Font("Open Sans", Font.PLAIN, 15));
		adobeLR_rate.setBounds(482, 276, 92, 19);
		adobeLR.setForeground(Color.black);
		bgPanel.add(adobeLR_rate);
		
		JLabel photography = new JLabel(educSkill.photoSkill);
		photography.setFont(new Font("Open Sans", Font.BOLD, 20));
		photography.setBounds(425, 327, 251, 35);
		photography.setForeground(Color.black);
		bgPanel.add(photography);
		
		JLabel photography_rate = new JLabel("7/10");
		photography_rate.setFont(new Font("Open Sans", Font.PLAIN, 15));
		photography_rate.setBounds(482, 370, 92, 19);
		photography_rate.setForeground(Color.black);
		bgPanel.add(photography_rate);
		
		JLabel videography = new JLabel(educSkill.videoSkill);
		videography.setFont(new Font("Open Sans", Font.BOLD, 20));
		videography.setBounds(425, 411, 251, 35);
		videography.setForeground(Color.black);
		bgPanel.add(videography);
		
		JLabel videography_rate = new JLabel("9/10");
		videography_rate.setFont(new Font("Open Sans", Font.PLAIN, 15));
		videography_rate.setBounds(482, 454, 92, 19);
		videography_rate.setForeground(Color.black);
		bgPanel.add(videography_rate);
		//END INHERITANCE
		
		/*Inherits ImageIcon and Image functions from Skills_Images.java
		 to avoid repetition*/
		bgPanel.add(new Skills_Images("/premiere pro.png", 435, 172));
		bgPanel.add(new Skills_Images("/lightroom.png", 435, 265));
		bgPanel.add(new Skills_Images("/photography.png", 435, 359));
		bgPanel.add(new Skills_Images("/videography.png", 435, 443));
		//END INHERITANCE
		
		JLabel educskillsBGImage = new JLabel();
		educskillsBGImage.setBounds(0, 0, 800, 600);
		educskillsBGImage.setIcon(educskillsBG);
		bgPanel.add(educskillsBGImage);
	}

}
