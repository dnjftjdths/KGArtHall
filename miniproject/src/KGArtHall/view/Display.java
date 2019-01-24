package KGArtHall.view;

import javax.swing.JFrame;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainView mainview = null;
	public MembershipPanel membership = null;
	public MainView loginview = null;
	public InfoPagoda infopagoda = null;
	public InfoJawsbar infojawsbar = null;
	public InfoMarathon infomarathon = null;
	public InfoBasketball infobasketball = null;
	public InfoThisjava infothisjava = null;
	public InfoPresentation infopresentation = null;
	public ReservePagoda reservepagoda = null;
	
	public static void main(String[] args) {
		Display view = new Display();
		
		view.setTitle("KGArtHall");
		view.mainview = new MainView(view);
		view.membership = new MembershipPanel(view);
		view.add(view.mainview);
		view.infopagoda = new InfoPagoda(view);
		view.infojawsbar = new InfoJawsbar(view);
		view.infomarathon = new InfoMarathon(view);
		view.infobasketball = new InfoBasketball(view);
		view.infothisjava = new InfoThisjava(view);
		view.infopresentation = new InfoPresentation(view);
		view.reservepagoda = new ReservePagoda(view);
		
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
		} else if(panelName.equals("infopagoda")) {
			getContentPane().removeAll();
			getContentPane().add(infopagoda);
			revalidate();
			repaint();
		} else if(panelName.equals("infojawsbar")) {
			getContentPane().removeAll();
			getContentPane().add(infojawsbar);
			revalidate();
			repaint();
		} else if(panelName.equals("infomarathon")) {
			getContentPane().removeAll();
			getContentPane().add(infomarathon);
			revalidate();
			repaint();
		} else if(panelName.equals("infobasketball")) {
			getContentPane().removeAll();
			getContentPane().add(infobasketball);
			revalidate();
			repaint();
		} else if(panelName.equals("infothisjava")) {
			getContentPane().removeAll();
			getContentPane().add(infothisjava);
			revalidate();
			repaint();
		} else if(panelName.equals("infopresentation")) {
			getContentPane().removeAll();
			getContentPane().add(infopresentation);
			revalidate();
			repaint();
		} else if(panelName.equals("reservepagoda")) {
			getContentPane().removeAll();
			getContentPane().add(reservepagoda);
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
