package KGArtHall.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {

	MainView(){
		Image image = Toolkit.getDefaultToolkit().createImage("image\\Title.png");
		JLabel title = new JLabel(new ImageIcon(image));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setSize(1000, 100);
		add(title);
		
		MenuPanel menu = new MenuPanel();
		add(menu);
		
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainView();
	}
	
}
