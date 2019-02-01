package KGArtHall.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import KGArtHall.view.main.Display;

public class AdvertisePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AdvertisePanel(Display view) {


		// ±§∞Ì
		JLabel lblNewLabel = new JLabel("\uAD11\uACE0");
		lblNewLabel.setBounds(186, 10, 164, 32);
		add(lblNewLabel);
		
		// ¿ÃπÃ¡ˆ
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\Moviead3.png");
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(image1));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(47, 41, 300, 275);
		add(lblNewLabel_1);
		
		
		setBounds(30, 600, 400, 500);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setVisible(true);
	}
}
