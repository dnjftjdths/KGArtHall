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
import java.awt.Color;

public class InfoJawsbar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoJawsbar(Display view){
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\jawsbarinfo.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(900,730,100,50);
		
		JLabel b = new JLabel(new ImageIcon(image2));
		b.setBounds(149,228,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel binfo1 = new JLabel("제목 : 이 겨울, 눈꽃 머금은 죠스바");
		binfo1.setForeground(Color.GREEN);
		JLabel binfo2 = new JLabel("일시 : 2019.12.01 ~ 2020.02.29");
		binfo2.setForeground(Color.GREEN);
		JLabel binfo3 = new JLabel("종류 : 콘서트");
		binfo3.setForeground(Color.GREEN);
		JLabel binfo4 = new JLabel("장소 : KGArtHall 501호");
		binfo4.setForeground(Color.GREEN);
		JLabel binfo5 = new JLabel("가격 : 30,000원");
		binfo5.setForeground(Color.GREEN);
		JLabel binfo6 = new JLabel("출연 : 조진화");
		binfo6.setForeground(Color.GREEN);
		
		// 줄거리 내용
		JLabel summary1= new JLabel("이 겨울, 몸은 추워도 마음은 따뜻해야하지 않습니까?");
		summary1.setForeground(Color.GREEN);
		JLabel summary2= new JLabel("여기 마음을 녹여줄 감미로운 목소리");
		summary2.setForeground(Color.GREEN);
		JLabel summary3= new JLabel("조진화의 겨울 콘서트로 오세요");
		summary3.setForeground(Color.GREEN);
		JLabel summary4= new JLabel("올 겨울을 책임지겠습니다.");
		summary4.setForeground(Color.GREEN);
		
		binfo1.setBounds(700,200,400,100);
		binfo2.setBounds(700,250,300,100);
		binfo3.setBounds(700,300,300,100);
		binfo4.setBounds(700,350,300,100);
		binfo5.setBounds(700,400,300,100);
		binfo6.setBounds(700,450,300,100);
		
		// 글씨 크기
		binfo1.setFont(binfo1.getFont().deriveFont(20.0f));
		binfo2.setFont(binfo2.getFont().deriveFont(20.0f));
		binfo3.setFont(binfo3.getFont().deriveFont(20.0f));
		binfo4.setFont(binfo4.getFont().deriveFont(20.0f));
		binfo5.setFont(binfo5.getFont().deriveFont(20.0f));
		binfo6.setFont(binfo6.getFont().deriveFont(20.0f));
		
		// 줄거리 내용 위치
		summary1.setBounds(700,520,400,100);
		summary2.setBounds(700,550,400,100);
		summary3.setBounds(700,580,400,100);
		summary4.setBounds(700,610,400,100);
		
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!view.loginid.equals("")) {
					view.change("reservejawsbar");
				} else {
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});
		
		add(reservation);
		add(title);
		add(b);
		add(binfo1); add(binfo2); add(binfo3); add(binfo4); add(binfo5); add(binfo6);
		add(summary1); add(summary2); add(summary3); add(summary4); 
		
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\jawsback2.jpg");
		JLabel label = new JLabel(new ImageIcon(image1));
		label.setBounds(0, 50, 1280, 960);
		add(label);
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
	}
}
