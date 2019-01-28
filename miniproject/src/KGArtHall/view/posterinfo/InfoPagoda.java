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

public class InfoPagoda extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoPagoda(Display view){
		Image image1 = Toolkit.getDefaultToolkit().createImage("image\\pagodainfo.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(700,600,100,50);
		
		JLabel a = new JLabel(new ImageIcon(image1));
		a.setBounds(100,200,400,500);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel ainfo1 = new JLabel("제목 : 파고다의 저주");
		JLabel ainfo2 = new JLabel("일시 : 2019.06.01 ~ 2019.08.31");
		JLabel ainfo3 = new JLabel("종류 : 연극");
		JLabel ainfo4 = new JLabel("장소 : KGArtHall");
		JLabel ainfo5 = new JLabel("가격 : 50,000원");
		JLabel ainfo6 = new JLabel("출연 : KGITBANK 극단");
		
		
		ainfo1.setBounds(700,200,300,100);
		ainfo2.setBounds(700,250,300,100);
		ainfo3.setBounds(700,300,300,100);
		ainfo4.setBounds(700,350,300,100);
		ainfo5.setBounds(700,400,300,100);
		ainfo6.setBounds(700,450,300,100);
		
		// 글씨 크기
		ainfo1.setFont(ainfo1.getFont().deriveFont(20.0f));
		ainfo2.setFont(ainfo2.getFont().deriveFont(20.0f));
		ainfo3.setFont(ainfo3.getFont().deriveFont(20.0f));
		ainfo4.setFont(ainfo4.getFont().deriveFont(20.0f));
		ainfo5.setFont(ainfo5.getFont().deriveFont(20.0f));
		ainfo6.setFont(ainfo6.getFont().deriveFont(20.0f));
		
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
		add(ainfo1); add(ainfo2); add(ainfo3); add(ainfo4); add(ainfo5); add(ainfo6);
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
		
		
	}

}
