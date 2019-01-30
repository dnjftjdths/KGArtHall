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
		JButton reservation = new JButton("����");

		reservation.setBounds(900,730,100,50);
		
		JLabel a = new JLabel(new ImageIcon(image1));
		a.setBounds(100,200,400,500);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel ainfo1 = new JLabel("���� : �İ���� ����");
		JLabel ainfo2 = new JLabel("�Ͻ� : 2019.06.01 ~ 2019.08.31");
		JLabel ainfo3 = new JLabel("���� : ����");
		JLabel ainfo4 = new JLabel("��� : KGArtHall");
		JLabel ainfo5 = new JLabel("���� : 50,000��");
		JLabel ainfo6 = new JLabel("�⿬ : KGITBANK �ش�");
		
		// �ٰŸ� ����
		JLabel summary1= new JLabel("��ȭ�ο� �İ�� �п��� ����� ã�ƿ� �ұ��� ���");
		JLabel summary2= new JLabel("�츮�� ��ü ���� ���� �ϴ°���?");
		JLabel summary3= new JLabel("�������� ���ҽ�Ƽ���� ���̿� �ΰ� ��Ȳ�ϴ� �츮�� ");
		JLabel summary4= new JLabel("�İ���� ���ְ� ���� �ȴ�.");
		
		// ������ ���� ��ġ
		ainfo1.setBounds(700,200,300,100);
		ainfo2.setBounds(700,250,300,100);
		ainfo3.setBounds(700,300,300,100);
		ainfo4.setBounds(700,350,300,100);
		ainfo5.setBounds(700,400,300,100);
		ainfo6.setBounds(700,450,300,100);
		
		// �ٰŸ� ���� ��ġ
		summary1.setBounds(700,520,400,100);
		summary2.setBounds(700,550,400,100);
		summary3.setBounds(700,580,400,100);
		summary4.setBounds(700,610,400,100);
		
		// �۾� ũ��
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
					JOptionPane.showMessageDialog(null, "�α����� ���� ���ּ���.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});
		add(reservation);
		add(title);
		add(a);
		add(ainfo1); add(ainfo2); add(ainfo3); add(ainfo4); add(ainfo5); add(ainfo6);
		add(summary1); add(summary2); add(summary3); add(summary4); 

		reservation.setBounds(700,600,100,50);
		
		JLabel a = new JLabel(new ImageIcon(image1));
		a.setBounds(100,200,400,500);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel ainfo1 = new JLabel("���� : �İ���� ����");
		JLabel ainfo2 = new JLabel("�Ͻ� : 2019.06.01 ~ 2019.08.31");
		JLabel ainfo3 = new JLabel("���� : ����");
		JLabel ainfo4 = new JLabel("��� : KGArtHall");
		JLabel ainfo5 = new JLabel("���� : 50,000��");
		JLabel ainfo6 = new JLabel("�⿬ : KGITBANK �ش�");
		
		
		ainfo1.setBounds(700,200,300,100);
		ainfo2.setBounds(700,250,300,100);
		ainfo3.setBounds(700,300,300,100);
		ainfo4.setBounds(700,350,300,100);
		ainfo5.setBounds(700,400,300,100);
		ainfo6.setBounds(700,450,300,100);
		
		// �۾� ũ��
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
					JOptionPane.showMessageDialog(null, "�α����� ���� ���ּ���.", "Message", JOptionPane.WARNING_MESSAGE);
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
