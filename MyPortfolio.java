package myPortfolio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPortfolio {

    private JFrame frmGetToKnow;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyPortfolio window = new MyPortfolio();
                    window.frmGetToKnow.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MyPortfolio() {
        initialize();
    }

    private void initialize() {
        frmGetToKnow = new JFrame();
        frmGetToKnow.setResizable(false);
        frmGetToKnow.setTitle("Get To Know Me!");
        frmGetToKnow.setSize(800, 600);
        frmGetToKnow.setLocationRelativeTo(null);
        frmGetToKnow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmGetToKnow.getContentPane().setLayout(null);
        
        JLabel basicInf = new JLabel("Basic Information");
        basicInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        basicInf.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		basicInf.setForeground(new Color(255, 71, 26));
        	}
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		basicInf.setForeground(Color.black);
        	}
        });
        basicInf.setFont(new Font("Tahoma", Font.BOLD, 12));
        basicInf.setHorizontalAlignment(SwingConstants.CENTER);
        basicInf.setBounds(73, 432, 128, 37);
        frmGetToKnow.getContentPane().add(basicInf);
        
        JLabel hobbyInf = new JLabel("Hobby/ies");
        hobbyInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hobbyInf.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		hobbyInf.setForeground(new Color(255, 71, 26));
        	}
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		hobbyInf.setForeground(Color.black);
        	}
        });
        hobbyInf.setHorizontalAlignment(SwingConstants.CENTER);
        hobbyInf.setFont(new Font("Tahoma", Font.BOLD, 12));
        hobbyInf.setBounds(220, 432, 128, 37);
        frmGetToKnow.getContentPane().add(hobbyInf);
        
        JLabel talentInf = new JLabel("Talents & Achievements");
        talentInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        talentInf.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		talentInf.setForeground(new Color(255, 71, 26));
        	}
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		talentInf.setForeground(Color.black);
        	}
        });
        talentInf.setHorizontalAlignment(SwingConstants.CENTER);
        talentInf.setFont(new Font("Tahoma", Font.BOLD, 12));
        talentInf.setBounds(396, 432, 159, 37);
        frmGetToKnow.getContentPane().add(talentInf);
        
        JLabel faqInf = new JLabel("FAQs");
        faqInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        faqInf.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		faqInf.setForeground(new Color(255, 71, 26));
        	}
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		faqInf.setForeground(Color.black);
        	}
        });
        faqInf.setHorizontalAlignment(SwingConstants.CENTER);
        faqInf.setFont(new Font("Tahoma", Font.BOLD, 12));
        faqInf.setBounds(615, 432, 88, 37);
        frmGetToKnow.getContentPane().add(faqInf);
    }
}
