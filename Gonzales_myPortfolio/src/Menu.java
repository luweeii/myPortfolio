import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Menu extends JLabel {
	
	//Parent class for menu buttons
    public Menu(String text) {
        super(text);
        setForeground(Color.BLACK);
        setFont(new Font("Tahoma", Font.BOLD, 15));
        setHorizontalAlignment(SwingConstants.CENTER);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(new Color(238, 238, 238));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.BLACK);
            }
        });
    }
    
        public JLabel setupBackButton(JPanel bgPanel) {
            // Set Back Icon
            ImageIcon backIcon = new ImageIcon(getClass().getResource("/angle-left.png"));
            Image img = backIcon.getImage();
            JLabel backBtn = new JLabel("");
            backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            backBtn.setBounds(10, 11, 21, 21);
            Image newImg = img.getScaledInstance(backBtn.getWidth(), backBtn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledImg = new ImageIcon(newImg);
            backBtn.setIcon(scaledImg);
            bgPanel.add(backBtn);
            
            return backBtn;

    }

}