package KGArtHall.view;

import javax.swing.JFrame;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainView mainview = null;
	public MembershipPanel membership = null;
	public MainView loginview = null;
	
	public static void main(String[] args) {
		Display view = new Display();
		
		view.setTitle("KGArtHall");
		view.mainview = new MainView(view);
		view.membership = new MembershipPanel(view);
		view.add(view.mainview);
		
		view.setResizable(false);
		view.setSize(1280, 960);
		view.setLayout(null);
		view.setVisible(true);
		
	}
	
	public void change(String panelName) {
		if(panelName.equals("mainview")) {
			getContentPane().removeAll();
			getContentPane().add(mainview);
			revalidate();
			repaint();
		} else if(panelName.equals("membershippanel")) {
			getContentPane().removeAll();
			getContentPane().add(membership);
			MembershipPanel.setblank();
			revalidate();
			repaint();
		}
	}
	
	public void change(Display view, LoginPanel loginpanel) {
		getContentPane().removeAll();
		getContentPane().add(new MainView(view, loginpanel));
		revalidate();
		repaint();
	}
}
