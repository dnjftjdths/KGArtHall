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
		
		JMenu spring = new JMenu("봄");
		JMenu summer = new JMenu("여름");
		JMenu autumn = new JMenu("가을");
		JMenu winter = new JMenu("겨울");
		
		JMenuItem jan = new JMenuItem("1월");
		JMenuItem feb = new JMenuItem("2월");
		JMenuItem mar = new JMenuItem("3월");
		JMenuItem api = new JMenuItem("4월");
		JMenuItem may = new JMenuItem("5월");
		JMenuItem jun = new JMenuItem("6월");
		JMenuItem jul = new JMenuItem("7월");
		JMenuItem aug = new JMenuItem("8월");
		JMenuItem sep = new JMenuItem("9월");
		JMenuItem oct = new JMenuItem("10월");
		JMenuItem nov = new JMenuItem("11월");
		JMenuItem dec = new JMenuItem("12월");

		JMenuItem play = new JMenuItem("연극");
		JMenuItem concert = new JMenuItem("콘서트");
		JMenuItem experience = new JMenuItem("체험");
		JMenuItem event = new JMenuItem("행사");
		
		JMenuItem one = new JMenuItem("1만원 대");
		JMenuItem three = new JMenuItem("3만원 대");
		JMenuItem five = new JMenuItem("5만원 대");
		
		Dimension size = new Dimension(400, 20);
		date.setPreferredSize(size);	kind.setPreferredSize(size);	price.setPreferredSize(size);
		spring.setPreferredSize(size); summer.setPreferredSize(size); 
		autumn.setPreferredSize(size); winter.setPreferredSize(size);
		play.setPreferredSize(size); concert.setPreferredSize(size); experience.setPreferredSize(size);
		event.setPreferredSize(size);
		one.setPreferredSize(size); three.setPreferredSize(size); five.setPreferredSize(size);
		date.add(spring);	date.add(summer);	date.add(autumn); date.add(winter);
		spring.add(mar);	spring.add(api);	spring.add(may);
		summer.add(jun);	summer.add(jul);	summer.add(aug);
		autumn.add(sep);	autumn.add(oct);	autumn.add(nov);
		winter.add(dec);	winter.add(jan);	winter.add(feb);
		kind.add(play);	kind.add(concert);		kind.add(experience);	kind.add(event);
		price.add(one);	price.add(three); price.add(five);
		mb.add(date);	mb.add(kind);	mb.add(price);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(mb, gbc);

		mb.setBounds(30, 160, 1000, 40);
		mb.setBackground(Color.WHITE);
		
		setBounds(30, 160, 1200, 40);
		setBackground(Color.WHITE);
		setVisible(true);	
	}
}
