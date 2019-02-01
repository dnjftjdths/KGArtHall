package KGArtHall.view.main;

import javax.swing.JPanel;

import KGArtHall.view.AdvertisePanel;
import java.awt.Color;

public class MainView extends JPanel {
	private static final long serialVersionUID = 1L;
	int login = 0;
	public IDPWPanel idpw = null;
	
	MainView(Display view){
		TitlePanel title = new TitlePanel(view);
		add(title);
		
		idpw = new IDPWPanel(view);
		idpw.setBackground(Color.LIGHT_GRAY);
		idpw.setBounds(30, 220, 400, 207);
		add(idpw);
		
		PosterPanel poster = new PosterPanel(view);
		add(poster);
		
		AdvertisePanel advertise = new AdvertisePanel(view);
		advertise.setBounds(30, 456, 400, 342);
		poster.add(advertise);
		
		setSize(1280, 960);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
	
	MainView(Display view, LoginPanel loginpanel){
		TitlePanel title = new TitlePanel(view);
		add(title);
		
		add(loginpanel);
		
		PosterPanel poster = new PosterPanel(view);
		add(poster);
		
		setSize(1280, 960);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
}
