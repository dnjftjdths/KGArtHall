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

public class InfoThisjava extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoThisjava(Display view){
		Image image5 = Toolkit.getDefaultToolkit().createImage("image\\thisisjavainfo.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(900,730,100,50);
		
		JLabel e = new JLabel(new ImageIcon(image5));
		e.setBounds(100,200,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel einfo1 = new JLabel("제목 : 이것이 자바다");
		JLabel einfo2 = new JLabel("일시 : 2019.06.01 ~ 2019.08.31");
		JLabel einfo3 = new JLabel("종류 : 강연");
		JLabel einfo4 = new JLabel("장소 : KGArtHall 502호");
		JLabel einfo5 = new JLabel("가격 : 50,000원");
		JLabel einfo6 = new JLabel("출연 : 박성정");
		
		// 줄거리 내용
		JLabel summary1= new JLabel("5차 산업 혁명을 이끌어갈 인재 양성");
		JLabel summary2= new JLabel("당신도 그 인재가 될수 있습니다.");
		JLabel summary3= new JLabel("컴퓨터에 관심있는 누구나 참여 가능");
		JLabel summary4= new JLabel("(하버드 컴공과 출신 강사 직접 강의)");
		
		// 포스터 내용 위치
		einfo1.setBounds(700,200,400,100);
		einfo2.setBounds(700,250,300,100);
		einfo3.setBounds(700,300,300,100);
		einfo4.setBounds(700,350,300,100);
		einfo5.setBounds(700,400,300,100);
		einfo6.setBounds(700,450,300,100);
		
		// 줄거리 내용 위치
		summary1.setBounds(700,520,400,100);
		summary2.setBounds(700,550,400,100);
		summary3.setBounds(700,580,400,100);
		summary4.setBounds(700,610,400,100);
		
		// 글씨 크기
		einfo1.setFont(einfo1.getFont().deriveFont(20.0f));
		einfo2.setFont(einfo2.getFont().deriveFont(20.0f));
		einfo3.setFont(einfo3.getFont().deriveFont(20.0f));
		einfo4.setFont(einfo4.getFont().deriveFont(20.0f));
		einfo5.setFont(einfo5.getFont().deriveFont(20.0f));
		einfo6.setFont(einfo6.getFont().deriveFont(20.0f));
		
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!view.loginid.equals("")) {
					view.change("reservethisjava");
				} else {
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});	
		
		add(reservation);
		add(title);
		add(e);
		add(einfo1); add(einfo2); add(einfo3); add(einfo4); add(einfo5); add(einfo6);
		add(summary1); add(summary2); add(summary3); add(summary4); 
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
		
		
		
	}
}
