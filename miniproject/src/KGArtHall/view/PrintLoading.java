package KGArtHall.view;




import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import KGArtHall.view.main.Display;


public class PrintLoading extends JFrame {
	JProgressBar jb;
	int i = 0, num = 0;
	PrintLoading() {
		jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250, 150);
		setLayout(null);
	}
	public void iterate() {
		Thread iThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(i <= 2000) {
					jb.setValue(i);
					i = i + 20;
					try {Thread.sleep(10);} catch(Exception e) {}
				}
				JOptionPane.showMessageDialog(null, "티켓이 출력되었습니다.");
				dispose();
			}
		});
		iThread.start();
		
	}
}
