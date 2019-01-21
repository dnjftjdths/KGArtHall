package KGArtHall.view;

import javax.swing.JFrame;

public class Display extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MainView mainview = null;
	
	Display(){
		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		
		display.setTitle("KGArtHall");
		display.mainview = new MainView();
		
		display.add(display.mainview);
	}
}
