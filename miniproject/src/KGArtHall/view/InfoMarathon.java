package KGArtHall.view;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoMarathon extends JPanel{
	private static final long serialVersionUID = 1L;
	
	InfoMarathon(Display view){
		Image image3 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton reservation3 = new JButton("����");
		reservation3.setBounds(700,600,100,50);
		
		JLabel c = new JLabel(new ImageIcon(image3));
		c.setBounds(100,200,200,250);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel cinfo1 = new JLabel("���� : Green Marathon");
		JLabel cinfo2 = new JLabel("�Ͻ� : 2019.03.01 ~ 2019.05.31");
		JLabel cinfo3 = new JLabel("���� : ü��");
		JLabel cinfo4 = new JLabel("��� : ���ȴ뱳 ~  ������");
		JLabel cinfo5 = new JLabel("���� : 30,000��");
		JLabel cinfo6 = new JLabel("�⿬ : ������");
				
				
		cinfo1.setBounds(700,200,300,100);
		cinfo2.setBounds(700,250,300,100); 
		cinfo3.setBounds(700,300,300,100);		
		cinfo4.setBounds(700,350,300,100);
		cinfo5.setBounds(700,400,300,100);
		cinfo6.setBounds(700,450,300,100);
				
		// �۾� ũ��
		cinfo1.setFont(cinfo1.getFont().deriveFont(20.0f));
		cinfo2.setFont(cinfo2.getFont().deriveFont(20.0f));
		cinfo3.setFont(cinfo3.getFont().deriveFont(20.0f));
		cinfo4.setFont(cinfo4.getFont().deriveFont(20.0f));
		cinfo5.setFont(cinfo5.getFont().deriveFont(20.0f));
		cinfo6.setFont(cinfo6.getFont().deriveFont(20.0f));
				
				
		add(reservation3);
		add(title);
		add(c);
		add(cinfo1); add(cinfo2); add(cinfo3); add(cinfo4); add(cinfo5); add(cinfo6);
				
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
	}
}
