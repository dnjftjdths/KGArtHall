package KGArtHall.view;

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
	PosterPanel(){	
		
		JTextField tf = new JTextField();
	
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton a = new JButton(new ImageIcon(image1));
		a.setBounds(450,250,200,250);
		a.setMnemonic(KeyEvent.VK_1);
		a.setBackground(Color.WHITE);
		JLabel al = new JLabel("Title1");
		al.setBounds(450, 500, 200, 30);
		al.setHorizontalAlignment(JLabel.CENTER);
		
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton b = new JButton(new ImageIcon(image2));
		b.setBounds(700,250,200,250);
		b.setMnemonic(KeyEvent.VK_1);
		b.setBackground(Color.WHITE);
		JLabel bl = new JLabel("Title2");
		bl.setBounds(700, 500, 200, 30);
		bl.setHorizontalAlignment(JLabel.CENTER);
		
		Image image3 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton c = new JButton(new ImageIcon(image3));
		c.setBounds(450,550,200,250);
		c.setMnemonic(KeyEvent.VK_1);
		c.setBackground(Color.WHITE);
		JLabel cl = new JLabel("Title3");
		cl.setBounds(450, 800, 200, 30);
		cl.setHorizontalAlignment(JLabel.CENTER);

		Image image4 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton d = new JButton(new ImageIcon(image4));
		d.setBounds(700,550,200,250);
		d.setMnemonic(KeyEvent.VK_1);
		d.setBackground(Color.WHITE);
		JLabel dl = new JLabel("Title4");
		dl.setBounds(700, 800, 200, 30);
		dl.setHorizontalAlignment(JLabel.CENTER);
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(tf);
		add(al); add(bl); add(cl); add(dl);
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
		
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});


	
	}
}