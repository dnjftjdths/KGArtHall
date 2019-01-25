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

public class InfoThisjava extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public InfoThisjava(Display view){
		Image image5 = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JButton reservation = new JButton("����");
		reservation.setBounds(700,600,100,50);
		
		JLabel e = new JLabel(new ImageIcon(image5));
		e.setBounds(100,200,200,250);
		
		// ����ȭ������ �̵�
		TitlePanel title = new TitlePanel(view);
		
		// ������ ����
		JLabel einfo1 = new JLabel("���� : �̰��� �ڹٴ�");
		JLabel einfo2 = new JLabel("�Ͻ� : 2019.06.01 ~ 2019.08.31");
		JLabel einfo3 = new JLabel("���� : ����");
		JLabel einfo4 = new JLabel("��� : KGArtHall 502ȣ");
		JLabel einfo5 = new JLabel("���� : 50,000��");
		JLabel einfo6 = new JLabel("�⿬ : �ڼ���");
		
		
		einfo1.setBounds(700,200,400,100);
		einfo2.setBounds(700,250,300,100);
		einfo3.setBounds(700,300,300,100);
		einfo4.setBounds(700,350,300,100);
		einfo5.setBounds(700,400,300,100);
		einfo6.setBounds(700,450,300,100);
		
		// �۾� ũ��
		einfo1.setFont(einfo1.getFont().deriveFont(20.0f));
		einfo2.setFont(einfo2.getFont().deriveFont(20.0f));
		einfo3.setFont(einfo3.getFont().deriveFont(20.0f));
		einfo4.setFont(einfo4.getFont().deriveFont(20.0f));
		einfo5.setFont(einfo5.getFont().deriveFont(20.0f));
		einfo6.setFont(einfo6.getFont().deriveFont(20.0f));
		
		reservation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(view.login == 1) {
					view.change("reservethisjava");
				} else if(view.login == 0){
					JOptionPane.showMessageDialog(null, "�α����� ���� ���ּ���.", "Message", JOptionPane.WARNING_MESSAGE);
					view.change("mainview");
				}
			}
		});	
		
		add(reservation);
		add(title);
		add(e);
		add(einfo1); add(einfo2); add(einfo3); add(einfo4); add(einfo5); add(einfo6);
		
		setSize(1280,960);
		setLayout(null);
		setVisible(true);
		
		
		
	}
}
