package KGArtHall.view.main;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PosterPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	PosterPanel(Display view){	
		
		JTextField tf = new JTextField();
	
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\pagoda.png");
		JButton a = new JButton(new ImageIcon(image1));
		a.setBounds(450,250,200,250);
		a.setMnemonic(KeyEvent.VK_1);
		a.setBackground(Color.WHITE);
		JLabel al = new JLabel("파고다의 저주");
		al.setBounds(450, 500, 200, 30);
		al.setHorizontalAlignment(JLabel.CENTER);
		
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\jawsbar.png");
		JButton b = new JButton(new ImageIcon(image2));
		b.setBounds(700,250,200,250);
		b.setMnemonic(KeyEvent.VK_1);
		b.setBackground(Color.WHITE);
		JLabel bl = new JLabel("이 겨울, 눈꽃 머금은 죠스바");
		bl.setBounds(700, 500, 200, 30);
		bl.setHorizontalAlignment(JLabel.CENTER);
		
		Image image3 = Toolkit.getDefaultToolkit().createImage("image\\marathon.png");
		JButton c = new JButton(new ImageIcon(image3));
		c.setBounds(950,250,200,250); 
		c.setMnemonic(KeyEvent.VK_1);
		c.setBackground(Color.WHITE);
		JLabel cl = new JLabel("Green Marathon");
		cl.setBounds(950, 500, 200, 30);
		cl.setHorizontalAlignment(JLabel.CENTER);

		Image image4 = Toolkit.getDefaultToolkit().createImage("image\\thisisjava.png");
		JButton d = new JButton(new ImageIcon(image4));
		d.setBounds(450,550,200,250);
		d.setMnemonic(KeyEvent.VK_1);
		d.setBackground(Color.WHITE);
		JLabel dl = new JLabel("이것이 자바다");
		dl.setBounds(450, 800, 200, 30);
		dl.setHorizontalAlignment(JLabel.CENTER);
		
		Image image5 = Toolkit.getDefaultToolkit().createImage("image\\basketball.png");
		JButton e = new JButton(new ImageIcon(image5));
		e.setBounds(700,550,200,250);
		e.setMnemonic(KeyEvent.VK_1);
		e.setBackground(Color.WHITE);
		JLabel el = new JLabel("신장이 아닌, 심장으로");
		el.setBounds(700, 800, 200, 30);
		el.setHorizontalAlignment(JLabel.CENTER);
		
		Image image6 = Toolkit.getDefaultToolkit().createImage("image\\presentation.png");
		JButton f = new JButton(new ImageIcon(image6));
		f.setBounds(950,550,200,250);
		f.setMnemonic(KeyEvent.VK_1);
		f.setBackground(Color.WHITE);
		JLabel fl = new JLabel("프로젝트 발표회");
		fl.setBounds(950, 800, 200, 30);
		fl.setHorizontalAlignment(JLabel.CENTER);
		
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		add(tf);
		add(al); add(bl); add(cl); add(dl); add(el); add(fl);
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
		
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infopagoda");
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infojawsbar");
			}
		});
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infomarathon");
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infothisjava");
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infobasketball");
			}
		});
		f.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infopresentation");
			}
		});

	
	}
}
