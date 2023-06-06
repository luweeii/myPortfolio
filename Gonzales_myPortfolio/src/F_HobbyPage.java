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

public class F_HobbyPage {
T3_Hobby hobbies = new T5_EducSkills();
	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_HobbyPage window = new F_HobbyPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F_HobbyPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Hobbies");
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
		
		//Disable Hobbies button
		Menu hbyInf = new Menu ("Hobbies");
		hbyInf.removeMouseListener(hbyInf.getMouseListeners()[0]);
		hbyInf.setForeground(new Color(115, 115, 115));
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
		
		//Set Basic Information background
		ImageIcon hobbypageBG = new ImageIcon(getClass().getResource("/hobby.png"));
		
		//Inherits the hobby strings from T3_Hobbby.java -(subclass)
		JLabel hobby1 = new JLabel(hobbies.hobby1);
		hobby1.setFont(new Font("Open Sans", Font.BOLD, 20));
		hobby1.setHorizontalAlignment(SwingConstants.CENTER);
		hobby1.setBounds(140, 294, 140, 32);
		hobby1.setForeground(Color.black);
		bgPanel.add(hobby1);
		
		JLabel hobby2 = new JLabel(hobbies.hobby2);
		hobby2.setFont(new Font("Open Sans", Font.BOLD, 20));
		hobby2.setHorizontalAlignment(SwingConstants.CENTER);
		hobby2.setBounds(513, 294, 140, 32);
		hobby2.setForeground(Color.black);
		bgPanel.add(hobby2);
		
		JLabel hobby3 = new JLabel(hobbies.hobby3);
		hobby3.setFont(new Font("Open Sans", Font.BOLD, 20));
		hobby3.setHorizontalAlignment(SwingConstants.CENTER);
		hobby3.setBounds(283, 449, 239, 32);
		hobby3.setForeground(Color.black);
		bgPanel.add(hobby3);
		//INHERITANCE END
		
		JLabel hobbypageBGImage = new JLabel();
		hobbypageBGImage.setBounds(0, 0, 800, 600);
		hobbypageBGImage.setIcon(hobbypageBG);
		bgPanel.add(hobbypageBGImage);
	}

}
