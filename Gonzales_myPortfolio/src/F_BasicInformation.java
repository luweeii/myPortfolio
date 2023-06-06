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

public class F_BasicInformation {
	T2_BasicInformation bInfo = new T5_EducSkills();
	JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_BasicInformation window = new F_BasicInformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_BasicInformation() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Basic Information");
		frame.setSize(814, 636);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Disable Basic Information button
		Menu bscInf = new Menu ("<html><center>Basic</center><center>Information</center></html>");
		bscInf.setFont(new Font("Open Sans", Font.BOLD, 15));
		bscInf.removeMouseListener(bscInf.getMouseListeners()[0]);
		bscInf.setForeground(new Color (115, 115, 115));
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

		//Inherits basicInfo String from T2_BasicInformation.java - (subclass)
		JLabel basicInfoLbl = new JLabel(bInfo.basicInfo);
		basicInfoLbl.setFont(new Font("Open Sans", Font.PLAIN, 22));
		basicInfoLbl.setVerticalAlignment(SwingConstants.TOP);
		basicInfoLbl.setBounds(290, 51, 435, 454);
		basicInfoLbl.setForeground(Color.black);
		bgPanel.add(basicInfoLbl);
		//END INHERITANCE
		
		//Set Basic Information background
		ImageIcon basicInfoBG = new ImageIcon(getClass().getResource("basic information.png"));
		
		JLabel basicInformationBGImage = new JLabel();
		basicInformationBGImage.setBounds(0, 0, 800, 600);
		basicInformationBGImage.setIcon(basicInfoBG);
		bgPanel.add(basicInformationBGImage);
	}

}
