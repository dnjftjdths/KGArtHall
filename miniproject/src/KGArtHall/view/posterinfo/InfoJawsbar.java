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

public class InfoJawsbar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoJawsbar(Display view){
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(700,600,100,50);
		
		JLabel b = new JLabel(new ImageIcon(image2));
		b.setBounds(100,200,200,250);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel binfo1 = new JLabel("제목 : 이 겨울, 눈꽃 머금은 죠스바");
		JLabel binfo2 = new JLabel("일시 : 2019.12.01 ~ 2020.02.29");
		JLabel binfo3 = new JLabel("종류 : 콘서트");
		JLabel binfo4 = new JLabel("장소 : KGArtHall 501호");
		JLabel binfo5 = new JLabel("가격 : 30,000원");
		JLabel binfo6 = new JLabel("출연 : 조진화♥");
		
		
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
		
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(view.login == 1) {
					view.change("reservejawsbar");
				} else if(view.login == 0){
					JOptionPane.showMessageDialog(null, "로그인을 먼저 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});
		
		add(reservation);
		add(title);
		add(b);
		add(binfo1); add(binfo2); add(binfo3); add(binfo4); add(binfo5); add(binfo6);
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
	}
}
