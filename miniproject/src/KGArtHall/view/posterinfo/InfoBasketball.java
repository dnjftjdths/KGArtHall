package KGArtHall.view.posterinfo;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class InfoBasketball extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoBasketball(Display view){
		Image image4 = Toolkit.getDefaultToolkit().createImage("image\\basketballinfo.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(700,600,100,50);
		
		JLabel d = new JLabel(new ImageIcon(image4));
		d.setBounds(100,200,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel dinfo1 = new JLabel("제목 : 신장이 아닌, 심장으로");
		JLabel dinfo2 = new JLabel("일시 : 2019.09.01 ~ 2019.11.30");
		JLabel dinfo3 = new JLabel("종류 : 체험");
		JLabel dinfo4 = new JLabel("장소 : 경남공고 운동장");
		JLabel dinfo5 = new JLabel("가격 : 10,000원");
		JLabel dinfo6 = new JLabel("출연 : 박정훈");
						
						
		dinfo1.setBounds(700,200,300,100);
		dinfo2.setBounds(700,250,300,100); 
		dinfo3.setBounds(700,300,300,100);		
		dinfo4.setBounds(700,350,300,100);
		dinfo5.setBounds(700,400,300,100);
		dinfo6.setBounds(700,450,300,100);
						
		// 글씨 크기
		dinfo1.setFont(dinfo1.getFont().deriveFont(20.0f));
		dinfo2.setFont(dinfo2.getFont().deriveFont(20.0f));
		dinfo3.setFont(dinfo3.getFont().deriveFont(20.0f));
		dinfo4.setFont(dinfo4.getFont().deriveFont(20.0f));
		dinfo5.setFont(dinfo5.getFont().deriveFont(20.0f));
		dinfo6.setFont(dinfo6.getFont().deriveFont(20.0f));
					
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!view.loginid.equals("")) {
					view.change("reservebasketball");
				} else {
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});		
		
		add(reservation);
		add(title);
		add(d);
		add(dinfo1); add(dinfo2); add(dinfo3); add(dinfo4); add(dinfo5); add(dinfo6);
				
		setSize(1280,960);
		setLayout(null);
		setVisible(true);	
		
		
	}
}
