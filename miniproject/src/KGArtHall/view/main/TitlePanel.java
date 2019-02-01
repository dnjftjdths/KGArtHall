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
import javax.swing.SwingConstants;

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

		JPanel line = new JPanel();
		line.setBounds(0, 160, 1280, 5);
		line.setBackground(new Color(0, 100, 0));
		add(line);
		
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(387, 0, 506, 150);
		title.setBackground(Color.WHITE);
		add(title);
		
		setBounds(0, 0, 1280, 165);
		setLayout(null);
		setBackground(Color.WHITE);
		setVisible(true);
	}
	

}
