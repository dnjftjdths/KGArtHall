package KGArtHall.view;

import javax.swing.JFrame;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static MainView mainview = null;
	public static MembershipPanel membership = null;
	
	public static void main(String[] args) {
		Display view = new Display();
		
		view.setTitle("KGArtHall");
		view.mainview = new MainView(view);
		view.membership = new MembershipPanel(view);
		
		view.add(view.mainview);
		
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
			revalidate();
			repaint();
		}

	}
}
