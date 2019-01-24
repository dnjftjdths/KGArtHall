package KGArtHall.view.posterinfo;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class InfoPresentation extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoPresentation(Display view){
		Image image6 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton reservation = new JButton("예매");
		reservation.setBounds(700,600,100,50);
		
		JLabel f = new JLabel(new ImageIcon(image6));
		f.setBounds(100,200,200,250);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		// 포스터 내용
		JLabel finfo1 = new JLabel("제목 : 프로젝트 발표회");
		JLabel finfo2 = new JLabel("일시 : 2019.02.15");
		JLabel finfo3 = new JLabel("종류 : 행사");
		JLabel finfo4 = new JLabel("장소 : KGArtHall");
		JLabel finfo5 = new JLabel("가격 : 10,000원");
		JLabel finfo6 = new JLabel("출연 : PAGODA ITBANK 취업반");
				
				
		finfo1.setBounds(700,200,400,100);
		finfo2.setBounds(700,250,300,100);
		finfo3.setBounds(700,300,300,100);
		finfo4.setBounds(700,350,300,100);
		finfo5.setBounds(700,400,300,100);
		finfo6.setBounds(700,450,300,100);
				
		// 글씨 크기
		finfo1.setFont(finfo1.getFont().deriveFont(20.0f));
		finfo2.setFont(finfo2.getFont().deriveFont(20.0f));
		finfo3.setFont(finfo3.getFont().deriveFont(20.0f));
		finfo4.setFont(finfo4.getFont().deriveFont(20.0f));
		finfo5.setFont(finfo5.getFont().deriveFont(20.0f));
		finfo6.setFont(finfo6.getFont().deriveFont(20.0f));
					
		add(reservation);
		add(title);
		add(f);
		add(finfo1); add(finfo2); add(finfo3); add(finfo4); add(finfo5); add(finfo6);			
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
		
		
		
		
		
	}
}
