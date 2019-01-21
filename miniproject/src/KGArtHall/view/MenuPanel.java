package KGArtHall.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	JMenu date, genre, price;
	JMenuItem thrill, romance, comic;
	JButton search;
	JMenuBar mb;

	MenuPanel() {
		date = new JMenu("��¥");
		genre = new JMenu("�帣");
		price = new JMenu("����");
		
		thrill = new JMenuItem("����/������");
		romance = new JMenuItem("���");
		comic = new JMenuItem("�ڹ�");
		thrill.setBackground(Color.WHITE);
		romance.setBackground(Color.WHITE);
		comic.setBackground(Color.WHITE);
		
		Image sc = Toolkit.getDefaultToolkit().createImage("image\\Search.png");
		search = new JButton(new ImageIcon(sc));
		
		mb = new JMenuBar();
		mb.setBackground(Color.WHITE);
		
		mb.add(date);	mb.add(genre);	mb.add(price);
		genre.add(thrill);	genre.add(romance);		genre.add(comic);
		
		search.setHorizontalAlignment(JButton.RIGHT);
		search.setBackground(Color.WHITE);
		
		add(mb);		
		add(search);
		
		setBounds(50, 110, 900, 30);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);	
	}
}
