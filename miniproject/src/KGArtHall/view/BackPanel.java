package KGArtHall.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import KGArtHall.view.main.Display;

public class BackPanel extends JPanel {

	BackPanel(Display view, String name) {
		JButton backbutton = new JButton("\u2190");
		backbutton.setFont(new Font("³ª´®°íµñ", Font.BOLD, 30));
		backbutton.setBackground(Color.DARK_GRAY);
		backbutton.setBounds(10, 10, 68, 58);
		backbutton.setForeground(Color.WHITE);
		add(backbutton);
		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("reserve" + name);
			}
		});
		setLayout(null);
		setBounds(0, 150, 300, 300);
		setVisible(true);
	}
}
