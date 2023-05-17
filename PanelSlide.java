package myPortfolio;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelSlide extends JPanel {

	public PanelSlide() {
		setLayout(null);
		list = new ArrayList<>();
		timer = new Timer (0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				animate();
			}
		});
	}
	
	private final List <Component> list;
	private final Timer timer;
	private Component comExit;
	private Component comShow;
	private int currentShowing;
	private boolean animateRight;
	
	public void init(Component... com) {
		if (com.length > 0) {
			for (Component c : com) {
				list.add(c);
				c.setSize(getSize());
				c.setVisible(false);
				this.add(c);
			}
			Component show = list.get(0);
			show.setVisible(true);
			show.setLocation(0, 0);
		}
	}
	
	public void show (int index) {
		if (!timer.isRunning()) {
			if(list.size() > 2 && index < list.size() && index != currentShowing) {
				comShow = list.get(index);
				comExit = list.get(currentShowing);
				animateRight = index < currentShowing;
				currentShowing = index;
				comShow.setVisible(true);
				if (animateRight) {
					comShow.setLocation(-comShow.getWidth(), 0);
				} else {
					comShow.setLocation(getWidth(), 0);
				}
				timer.start();
			}
		}
	}
	private void animate() {
		if (animateRight) {
			if(comShow.getLocation().x < 0) {
				comShow.setLocation(comShow.getLocation().x + 1, 0);
				comExit.setLocation(comExit.getLocation().x + 1, 0);
			} else {
				//stop animation
				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
			}
		} else {
			if(comShow.getLocation().x > 0) {
				comShow.setLocation(comShow.getLocation().x - 1, 0);
				comExit.setLocation(comExit.getLocation().x - 1, 0);
			} else {
				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
				
			}
		}
	}
}
