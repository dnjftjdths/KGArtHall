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
		JMenu date = new JMenu("����");
		JMenu kind = new JMenu("����");
		JMenu price = new JMenu("����");
		
		JMenuItem spring = new JMenuItem("��");
		JMenuItem summer = new JMenuItem("����");
		JMenuItem autumn = new JMenuItem("����");
		JMenuItem winter = new JMenuItem("�ܿ�");

		JMenuItem play = new JMenuItem("����");
		JMenuItem concert = new JMenuItem("�ܼ�Ʈ");
		JMenuItem experience = new JMenuItem("ü��");
		JMenuItem event = new JMenuItem("���");
		
		JMenuItem one = new JMenuItem("1���� ��");
		JMenuItem three = new JMenuItem("3���� ��");
		JMenuItem five = new JMenuItem("5���� ��");
		
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
