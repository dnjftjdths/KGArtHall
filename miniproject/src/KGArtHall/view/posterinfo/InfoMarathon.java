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

public class InfoMarathon extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoMarathon(Display view){
		Image image3 = Toolkit.getDefaultToolkit().createImage("image\\marathoninfo.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(900,730,100,50);
		
		JLabel c = new JLabel(new ImageIcon(image3));
		c.setBounds(100,200,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel cinfo1 = new JLabel("제목 : Green Marathon");
		JLabel cinfo2 = new JLabel("일시 : 2019.03.01 ~ 2019.05.31");
		JLabel cinfo3 = new JLabel("종류 : 체험");
		JLabel cinfo4 = new JLabel("장소 : 광안대교 ~  벡스코");
		JLabel cinfo5 = new JLabel("가격 : 30,000원");
		JLabel cinfo6 = new JLabel("출연 : 김정훈");
		
		// 줄거리 내용
		JLabel summary1= new JLabel("심각하게 진행되고 있는 환경 파괴");
		JLabel summary2= new JLabel("우리는 자연에게 무엇을 해줄수 있습니까?");
		JLabel summary3= new JLabel("자연에게 도움도 되고 건강도 챙기는");
		JLabel summary4= new JLabel("그린마라톤 함께 합시다");
				
				
		cinfo1.setBounds(700,200,300,100);
		cinfo2.setBounds(700,250,300,100); 
		cinfo3.setBounds(700,300,300,100);		
		cinfo4.setBounds(700,350,300,100);
		cinfo5.setBounds(700,400,300,100);
		cinfo6.setBounds(700,450,300,100);
				
		// 글씨 크기
		cinfo1.setFont(cinfo1.getFont().deriveFont(20.0f));
		cinfo2.setFont(cinfo2.getFont().deriveFont(20.0f));
		cinfo3.setFont(cinfo3.getFont().deriveFont(20.0f));
		cinfo4.setFont(cinfo4.getFont().deriveFont(20.0f));
		cinfo5.setFont(cinfo5.getFont().deriveFont(20.0f));
		cinfo6.setFont(cinfo6.getFont().deriveFont(20.0f));
		
		// 줄거리 내용 위치
		summary1.setBounds(700,520,400,100);
		summary2.setBounds(700,550,400,100);
		summary3.setBounds(700,580,400,100);
		summary4.setBounds(700,610,400,100);
				
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!view.loginid.equals("")) {
					view.change("reservemarathon");
				} else {
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});
		
		add(reservation);
		add(title);
		add(c);
		add(cinfo1); add(cinfo2); add(cinfo3); add(cinfo4); add(cinfo5); add(cinfo6);
		add(summary1); add(summary2); add(summary3); add(summary4); 
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
	}
}
