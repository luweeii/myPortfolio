import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

@SuppressWarnings("serial")
public class Skills_Images extends JLabel {
	
	//Parent class for ImageIcon and Image functions used in
	//my skills icons, Adobe premiere pro, lighroom, photography, and videography
    public Skills_Images(String imagePath, int x, int y) {
        setBounds(x, y, 40, 40);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(scaledImage));
    }
}
