package KGArtHall.view.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	MenuPanel() {
		setLayout(new GridBagLayout());
		JMenuBar mb = new JMenuBar();		
		JMenu date = new JMenu("계절");
		JMenu kind = new JMenu("종류");
		JMenu price = new JMenu("가격");
		
		JMenuItem spring = new JMenuItem("봄");
		JMenuItem summer = new JMenuItem("여름");
		JMenuItem autumn = new JMenuItem("가을");
		JMenuItem winter = new JMenuItem("겨울");

		JMenuItem play = new JMenuItem("연극");
		JMenuItem concert = new JMenuItem("콘서트");
		JMenuItem experience = new JMenuItem("체험");
		JMenuItem event = new JMenuItem("행사");
		
		JMenuItem one = new JMenuItem("1만원 대");
		JMenuItem three = new JMenuItem("3만원 대");
		JMenuItem five = new JMenuItem("5만원 대");
		
		Dimension size = new Dimension(250, 20);
		date.setPreferredSize(size);	kind.setPreferredSize(size);	price.setPreferredSize(size);
		spring.setPreferredSize(size); summer.setPreferredSize(size); 
		autumn.setPreferredSize(size); winter.setPreferredSize(size);
		play.setPreferredSize(size); concert.setPreferredSize(size); experience.setPreferredSize(size);
		event.setPreferredSize(size);
		one.setPreferredSize(size); three.setPreferredSize(size); five.setPreferredSize(size);
		date.add(spring);	date.add(summer);	date.add(autumn); date.add(winter);
		
		kind.add(play);	kind.add(concert);		kind.add(experience);	kind.add(event);
		price.add(one);	price.add(three); price.add(five);
		mb.add(date);	mb.add(kind);	mb.add(price);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(mb, gbc);

		mb.setBounds(30, 160, 1000, 20);
		mb.setBackground(Color.WHITE);
		
		setBounds(450, 160, 750, 40);
		setBackground(Color.WHITE);
		setVisible(true);	
	}
}
