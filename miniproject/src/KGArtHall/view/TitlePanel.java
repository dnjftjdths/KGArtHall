package KGArtHall.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	Display view;
	TitlePanel(Display view) {
		Image image = Toolkit.getDefaultToolkit().createImage("image\\Title.png");
		JButton title = new JButton(new ImageIcon(image));
		title.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg1) {
				view.change("mainview");
			}
		});
		
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(500,60,210,60);
		title.setBackground(Color.WHITE);
		add(title);
		setBounds(0, 0, 1280, 150);
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
	}

}