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

public class InfoBasketball extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoBasketball(Display view){
		Image image4 = Toolkit.getDefaultToolkit().createImage("image\\basketballinfo.png");
		JButton reservation = new JButton("����");
		reservation.setBounds(700,600,100,50);
		
		JLabel d = new JLabel(new ImageIcon(image4));
		d.setBounds(100,200,400,500);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel dinfo1 = new JLabel("���� : ������ �ƴ�, ��������");
		JLabel dinfo2 = new JLabel("�Ͻ� : 2019.09.01 ~ 2019.11.30");
		JLabel dinfo3 = new JLabel("���� : ü��");
		JLabel dinfo4 = new JLabel("��� : �泲���� ���");
		JLabel dinfo5 = new JLabel("���� : 10,000��");
		JLabel dinfo6 = new JLabel("�⿬ : ������");
						
						
		dinfo1.setBounds(700,200,300,100);
		dinfo2.setBounds(700,250,300,100); 
		dinfo3.setBounds(700,300,300,100);		
		dinfo4.setBounds(700,350,300,100);
		dinfo5.setBounds(700,400,300,100);
		dinfo6.setBounds(700,450,300,100);
						
		// �۾� ũ��
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
					JOptionPane.showMessageDialog(null, "�α����� ���� ���ּ���.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});		
		
		add(reservation);
		add(title);
		add(d);
		add(dinfo1); add(dinfo2); add(dinfo3); add(dinfo4); add(dinfo5); add(dinfo6);
				
		setSize(1280,960);
		setLayout(null);
		setVisible(true);	
		
		
	}
}
