package KGArtHall.view;

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
		JMenu genre = new JMenu("장르");
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

		JMenuItem thrill = new JMenuItem("공포/스릴러");
		JMenuItem romance = new JMenuItem("멜로");
		JMenuItem comic = new JMenuItem("코믹");
		
		JMenuItem one = new JMenuItem("1만원 대");
		JMenuItem three = new JMenuItem("3만원 대");
		JMenuItem five = new JMenuItem("5만원 대");
		
		Dimension size = new Dimension(400, 20);
		date.setPreferredSize(size);	genre.setPreferredSize(size);	price.setPreferredSize(size);
		spring.setPreferredSize(size); summer.setPreferredSize(size); 
		autumn.setPreferredSize(size); winter.setPreferredSize(size);
		thrill.setPreferredSize(size); romance.setPreferredSize(size); comic.setPreferredSize(size);
		one.setPreferredSize(size); three.setPreferredSize(size); five.setPreferredSize(size);
		date.add(spring);	date.add(summer);	date.add(autumn); date.add(winter);
		spring.add(mar);	spring.add(api);	spring.add(may);
		summer.add(jun);	summer.add(jul);	summer.add(aug);
		autumn.add(sep);	autumn.add(oct);	autumn.add(nov);
		winter.add(dec);	winter.add(jan);	winter.add(feb);
		genre.add(thrill);	genre.add(romance);		genre.add(comic);
		price.add(one);	price.add(three); price.add(five);
		mb.add(date);	mb.add(genre);	mb.add(price);
		
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
