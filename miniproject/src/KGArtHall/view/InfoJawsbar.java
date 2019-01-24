package KGArtHall.view;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoJawsbar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	InfoJawsbar(Display view){
		Image image2 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton reservation2 = new JButton("����");
		reservation2.setBounds(700,600,100,50);
		
		JLabel b = new JLabel(new ImageIcon(image2));
		b.setBounds(100,200,200,250);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel binfo1 = new JLabel("���� : �� �ܿ�, ���� �ӱ��� �ҽ���");
		JLabel binfo2 = new JLabel("�Ͻ� : 2019.12.01 ~ 2020.02.29");
		JLabel binfo3 = new JLabel("���� : �ܼ�Ʈ");
		JLabel binfo4 = new JLabel("��� : KGArtHall 501ȣ");
		JLabel binfo5 = new JLabel("���� : 30,000��");
		JLabel binfo6 = new JLabel("�⿬ : ����ȭ��");
		
		
		binfo1.setBounds(700,200,400,100);
		binfo2.setBounds(700,250,300,100);
		binfo3.setBounds(700,300,300,100);
		binfo4.setBounds(700,350,300,100);
		binfo5.setBounds(700,400,300,100);
		binfo6.setBounds(700,450,300,100);
		
		// �۾� ũ��
		binfo1.setFont(binfo1.getFont().deriveFont(20.0f));
		binfo2.setFont(binfo2.getFont().deriveFont(20.0f));
		binfo3.setFont(binfo3.getFont().deriveFont(20.0f));
		binfo4.setFont(binfo4.getFont().deriveFont(20.0f));
		binfo5.setFont(binfo5.getFont().deriveFont(20.0f));
		binfo6.setFont(binfo6.getFont().deriveFont(20.0f));
		
		
		add(reservation2);
		add(title);
		add(b);
		add(binfo1); add(binfo2); add(binfo3); add(binfo4); add(binfo5); add(binfo6);
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
	}
}
