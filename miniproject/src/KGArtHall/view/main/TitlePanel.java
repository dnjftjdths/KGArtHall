package KGArtHall.view.main;

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

	public TitlePanel(Display view) {
		Image image = Toolkit.getDefaultToolkit().createImage("image\\maintitle.png");
		JButton title = new JButton(new ImageIcon(image));
		title.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg1) {
				if (view.loginid.equals("")) {
					view.change("mainview");
				} else {
					view.change(view, view.mainview.idpw.loginpanel, view.loginid);
				}
			}
		});

		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(387, 0, 506, 150);
		title.setBackground(Color.WHITE);
		add(title);
		setBounds(0, 0, 1280, 150);
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
	}

}
