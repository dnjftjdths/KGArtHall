package KGArtHall.view;

import javax.swing.JPanel;

public class MainView extends JPanel {
	private static final long serialVersionUID = 1L;
	int login = 0;
	IDPWPanel idpw = null;
	
	MainView(Display view){
		TitlePanel title = new TitlePanel(view);
		add(title);
		
		MenuPanel menu = new MenuPanel();
		add(menu);
		
		idpw = new IDPWPanel(view);
		add(idpw);
		
		PosterPanel poster = new PosterPanel();
		add(poster);
		
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
	}
	
	MainView(Display view, LoginPanel loginpanel){
		TitlePanel title = new TitlePanel(view);
		add(title);
		
		MenuPanel menu = new MenuPanel();
		add(menu);
		
		add(loginpanel);
		
		PosterPanel poster = new PosterPanel();
		add(poster);
		
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
	}
}
