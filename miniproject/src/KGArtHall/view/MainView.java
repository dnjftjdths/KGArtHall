package KGArtHall.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel {
	private static final long serialVersionUID = 1L;

	MainView(Display view){
		Image image = Toolkit.getDefaultToolkit().createImage("image\\Title.png");
		JButton title = new JButton(new ImageIcon(image));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setSize(1280, 150);
		title.setBackground(Color.white);
		
		add(title);
		
		MenuPanel menu = new MenuPanel();
		add(menu);
		
		IDPWPanel idpw = new IDPWPanel(view);
		add(idpw);
		
		PosterPanel poster = new PosterPanel();
		add(poster);
		
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
	}
}
