package KGArtHall.view;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.add(new ReservePagoda(new Display()));
		
		f.setVisible(true);
		f.setSize(1280, 960);
	}
}
