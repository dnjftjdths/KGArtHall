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
		JButton reservation = new JButton("����");
		reservation.setForeground(Color.RED);
		reservation.setBackground(Color.BLACK);
		reservation.setFont(new Font("����ǹ��� ����", Font.PLAIN, 15));

		reservation.setBounds(1010,730,100,50);
		
		JLabel a = new JLabel(new ImageIcon(image1));
		a.setBounds(120,240,400,500);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel ainfo1 = new JLabel("����    :    �İ���� ����");
		ainfo1.setForeground(Color.WHITE);
		JLabel ainfo2 = new JLabel("�Ͻ�    :    2019.06.01 ~ 2019.08.31");
		ainfo2.setForeground(Color.WHITE);
		JLabel ainfo3 = new JLabel("����    :    ����");
		ainfo3.setForeground(Color.WHITE);
		JLabel ainfo4 = new JLabel("���    :    KGArtHall");
		ainfo4.setForeground(Color.WHITE);
		JLabel ainfo5 = new JLabel("����    :    50,000��");
		ainfo5.setForeground(Color.WHITE);
		JLabel ainfo6 = new JLabel("�⿬    :    KGITBANK �ش�");
		ainfo6.setForeground(Color.WHITE);
		JLabel ainfo7 = new JLabel("�ٰŸ�");
		ainfo7.setForeground(Color.WHITE);
		ainfo7.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		
		// �ٰŸ� ����
		JLabel summary1= new JLabel("��ȭ�ο� �İ�� �п��� ����� ã�ƿ� �ұ��� ���");
		summary1.setForeground(Color.WHITE);
		summary1.setFont(new Font("���������� Bold", Font.PLAIN, 13));
		JLabel summary2= new JLabel("�츮�� ��ü ���� ���� �ϴ°���?");
		summary2.setForeground(Color.WHITE);
		summary2.setFont(new Font("���������� Bold", Font.PLAIN, 13));
		JLabel summary3= new JLabel("�������� ���ҽ�Ƽ���� ���̿� �ΰ� ��Ȳ�ϴ� �츮�� ");
		summary3.setForeground(Color.WHITE);
		summary3.setFont(new Font("���������� Bold", Font.PLAIN, 13));
		JLabel summary4= new JLabel("�İ���� ���ְ� ���� �ȴ�.");
		summary4.setForeground(Color.WHITE);
		summary4.setFont(new Font("���������� Bold", Font.PLAIN, 13));
		
		// ������ ���� ��ġ
		ainfo1.setBounds(700,200,300,100);
		ainfo2.setBounds(700,250,500,100);
		ainfo3.setBounds(700,300,300,100);
		ainfo4.setBounds(700,350,300,100);
		ainfo5.setBounds(700,400,300,100);
		ainfo6.setBounds(700,450,300,100);
		ainfo7.setBounds(700,500,300,100);
		
		// �ٰŸ� ���� ��ġ
		summary1.setBounds(700,540,400,100);
		summary2.setBounds(700,570,400,100);
		summary3.setBounds(700,600,400,100);
		summary4.setBounds(700,630,400,100);
		
		// �۾� ũ��
		ainfo1.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		ainfo2.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		ainfo3.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		ainfo4.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		ainfo5.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		ainfo6.setFont(new Font("���������� Bold", Font.PLAIN, 20));
		
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
