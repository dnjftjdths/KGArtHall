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
import java.awt.Font;
import javax.swing.border.LineBorder;

public class InfoPagoda extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoPagoda(Display view){
		setBackground(new Color(240, 255, 240));
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\pagodainfo.png");
		JButton reservation = new JButton("예매");
		reservation.setForeground(Color.RED);
		reservation.setBackground(Color.BLACK);
		reservation.setFont(new Font("배달의민족 도현", Font.PLAIN, 15));

		reservation.setBounds(1010,730,100,50);
		
		JLabel a = new JLabel(new ImageIcon(image1));
		a.setBounds(120,240,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel ainfo1 = new JLabel("제목    :    파고다의 저주");
		ainfo1.setForeground(Color.WHITE);
		JLabel ainfo2 = new JLabel("일시    :    2019.06.01 ~ 2019.08.31");
		ainfo2.setForeground(Color.WHITE);
		JLabel ainfo3 = new JLabel("종류    :    연극");
		ainfo3.setForeground(Color.WHITE);
		JLabel ainfo4 = new JLabel("장소    :    KGArtHall");
		ainfo4.setForeground(Color.WHITE);
		JLabel ainfo5 = new JLabel("가격    :    50,000원");
		ainfo5.setForeground(Color.WHITE);
		JLabel ainfo6 = new JLabel("출연    :    KGITBANK 극단");
		ainfo6.setForeground(Color.WHITE);
		JLabel ainfo7 = new JLabel("줄거리");
		ainfo7.setForeground(Color.WHITE);
		ainfo7.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		
		// 줄거리 내용
		JLabel summary1= new JLabel("평화로운 파고다 학원에 어느날 찾아온 불길한 기운");
		summary1.setForeground(Color.WHITE);
		summary1.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 13));
		JLabel summary2= new JLabel("우리는 대체 어디로 가야 하는거지?");
		summary2.setForeground(Color.WHITE);
		summary2.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 13));
		JLabel summary3= new JLabel("서면점과 센텀시티점을 사이에 두고 방황하는 우리들 ");
		summary3.setForeground(Color.WHITE);
		summary3.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 13));
		JLabel summary4= new JLabel("파고다의 저주가 시작 된다.");
		summary4.setForeground(Color.WHITE);
		summary4.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 13));
		
		// 포스터 내용 위치
		ainfo1.setBounds(700,200,300,100);
		ainfo2.setBounds(700,250,500,100);
		ainfo3.setBounds(700,300,300,100);
		ainfo4.setBounds(700,350,300,100);
		ainfo5.setBounds(700,400,300,100);
		ainfo6.setBounds(700,450,300,100);
		ainfo7.setBounds(700,500,300,100);
		
		// 줄거리 내용 위치
		summary1.setBounds(700,540,400,100);
		summary2.setBounds(700,570,400,100);
		summary3.setBounds(700,600,400,100);
		summary4.setBounds(700,630,400,100);
		
		// 글씨 크기
		ainfo1.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		ainfo2.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		ainfo3.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		ainfo4.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		ainfo5.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		ainfo6.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!view.loginid.equals("")) {
					view.change("reservepagoda");
				} else {
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});
		add(reservation);
		add(title);
		add(a);
		add(ainfo1); add(ainfo2); add(ainfo3); add(ainfo4); add(ainfo5); add(ainfo6);	add(ainfo7);
		add(summary1); add(summary2); add(summary3); add(summary4); 

		setSize(1280,960);
		setLayout(null);
		
		
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\pagodaback.png");
		JLabel label = new JLabel(new ImageIcon(image2));
		label.setBounds(0, 50, 1280, 960);
		add(label);

		setVisible(true);
	}
}
