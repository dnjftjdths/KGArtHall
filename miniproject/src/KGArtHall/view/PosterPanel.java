package KGArtHall.view;

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
		JLabel label = new JLabel();
	
		Image image1 = Toolkit.getDefaultToolkit().createImage("images\\posterimage1.png");
		JButton a = new JButton(new ImageIcon(image1));
		a.setBounds(450,170,200,250);
		a.setMnemonic(KeyEvent.VK_1);
	
		
		Image image2 = Toolkit.getDefaultToolkit().createImage("images\\posterimage1.png");
		JButton b = new JButton(new ImageIcon(image2));
		b.setBounds(700,170,200,250);
		b.setMnemonic(KeyEvent.VK_1);
		
		
		Image image3 = Toolkit.getDefaultToolkit().createImage("images\\posterimage1.png");
		JButton c = new JButton(new ImageIcon(image3));
		c.setBounds(450,500,200,250);
		c.setMnemonic(KeyEvent.VK_1);
		
		Image image4 = Toolkit.getDefaultToolkit().createImage("images\\posterimage1.png");
		JButton d = new JButton(new ImageIcon(image4));
		d.setBounds(700,500,200,250);
		d.setMnemonic(KeyEvent.VK_1);
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(tf);
		add(label);
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
	public static void main(String[] args) {
		new PosterPanel();
	}
	}

