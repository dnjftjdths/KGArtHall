package KGArtHall.view.posterinfo;

import java.awt.Color;
import java.awt.Font;
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
		reservation.setForeground(Color.WHITE);
		reservation.setBackground(new Color(0, 100, 0));
		reservation.setFont(new Font("배달의민족 도현", Font.PLAIN, 15));
		reservation.setBounds(900,730,100,50);
		
		JLabel d = new JLabel(new ImageIcon(image4));
		d.setBounds(120,200,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel dinfo1 = new JLabel("제목 : 신장이 아닌, 심장으로");
		JLabel dinfo2 = new JLabel("일시 : 2019.09.01 ~ 2019.11.30");
		JLabel dinfo3 = new JLabel("종류 : 체험");
		JLabel dinfo4 = new JLabel("장소 : 경남공고 운동장");
		JLabel dinfo5 = new JLabel("가격 : 10,000원");
		JLabel dinfo6 = new JLabel("출연 : 박정훈");
		
		// 줄거리 내용
		JLabel summary1= new JLabel("90년대 우리들의 마음을 뜨겁게 했던 스포츠");
		JLabel summary2= new JLabel("농구는 신장인 아닌 심장으로 ");
		JLabel summary3= new JLabel("누구나 함께 할수 있습니다.");
		JLabel summary4= new JLabel("지금 당장 뛰쳐 나오십시요!");
						
		// 포스터 내용 위치				
		dinfo1.setBounds(700,200,300,100);
		dinfo2.setBounds(700,250,300,100); 
		dinfo3.setBounds(700,300,300,100);		
		dinfo4.setBounds(700,350,300,100);
		dinfo5.setBounds(700,400,300,100);
		dinfo6.setBounds(700,450,300,100);
		
		// 줄거리 내용 위치
		summary1.setBounds(700,520,400,100);
		summary2.setBounds(700,550,400,100);
		summary3.setBounds(700,580,400,100);
		summary4.setBounds(700,610,400,100);
						
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
		add(summary1); add(summary2); add(summary3); add(summary4); 
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);	
		
		
	}
}
