package KGArtHall.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import KGArtHall.model.ReserveInfo;
import KGArtHall.service.ConfirmService;
import KGArtHall.service.DeleteService;
import KGArtHall.view.main.Display;

public class ConfirmDetail extends JFrame {

	private JPanel contentPane;
	public static String ticketname = "";
	public static String ticketplace = "";
	
	public ConfirmDetail(Display view, ReserveInfo info) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel ticketpanel = new JPanel();
		ticketpanel.setBackground(Color.WHITE);
		ticketpanel.setBounds(15, 15, 550, 220);
		contentPane.add(ticketpanel);
		ticketpanel.setBorder(new LineBorder(new Color(221, 160, 221), 4));
		ticketpanel.setLayout(null);
		
		ticketchange(info.getName());
		JLabel Titlelabel = new JLabel(ticketname);
		Titlelabel.setFont(new Font("����", Font.BOLD, 15));
		Titlelabel.setBounds(249, 22, 300, 29);
		ticketpanel.add(Titlelabel);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MMM dd�� E����");
		JLabel datelabel = new JLabel("\uC77C\uC2DC : " + sdf.format(info.getDate()));
		datelabel.setBounds(249, 90, 211, 15);
		ticketpanel.add(datelabel);

		JLabel placelabel = new JLabel("\uC7A5\uC18C : " + ticketplace);
		placelabel.setBounds(249, 115, 211, 15);
		ticketpanel.add(placelabel);

		JLabel reserveno = new JLabel("\uC608\uB9E4 \uBC88\uD638 : " + info.getName().toUpperCase() + info.getReserveno());
		reserveno.setBounds(249, 61, 211, 15);
		ticketpanel.add(reserveno);

		Image poster = Toolkit.getDefaultToolkit().createImage("image\\ticket" + info.getName() +".png");
		JLabel posterlabel = new JLabel(new ImageIcon(poster));
		posterlabel.setBackground(Color.WHITE);
		posterlabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		posterlabel.setBounds(50, 50, 120, 124);
		ticketpanel.add(posterlabel);
		
		JLabel numlabel = new JLabel("�ż� : " + info.getNumber());
		numlabel.setBounds(249, 140, 211, 15);
		ticketpanel.add(numlabel);

		// �������
		JButton printbutton = new JButton("�������");
		printbutton.setBounds(300, 250, 97, 23);
		printbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteService deleteservice = DeleteService.getInstance();
				deleteservice.delete(info);
				JOptionPane.showMessageDialog(null, "���Ű� ��ҵǾ����ϴ�.");
				ConfirmService confirmservice = ConfirmService.getInstance();
				List<ReserveInfo> reserveinfo = confirmservice.confirm(view.loginid);
				view.reserveconfirm = new ReserveConfirm(view, reserveinfo);
				view.change("reserveconfirm");
				dispose();
			}

		});
	
		JButton disposebutton = new JButton("����");
		disposebutton.setBounds(450, 250, 97, 23);
		disposebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				view.change("reserveconfirm");
			}
		});
		
		contentPane.add(printbutton);
		add(disposebutton);
	}
	
	public static void ticketchange(String name) {
		if(name.equals("pagoda")) {
			ticketname = "�İ���� ����";
			ticketplace = "KGArtHall 601ȣ";
		}
		else if(name.equals("jawsbar")) {
			ticketname = "�� �ܿ�, ���� �ӱ��� �ҽ���";
			ticketplace = "KGArtHall 501ȣ";
		} 
		else if(name.equals("marathon")) {
			ticketname = "Green Marathon";
			ticketplace = "BEXCO";
		} 
		else if(name.equals("thisjava")) {
			ticketname = "�̰��� �ڹٴ�";
			ticketplace = "KGArtHall 502ȣ";
		} 
		else if(name.equals("basketball")) {
			ticketname = "������ �ƴ�, ��������";
			ticketplace = "�泲 ���� ����б� ���";
		} 
		else if(name.equals("presentation")) {
			ticketname = "������Ʈ ��ǥȸ";
			ticketplace = "KGArtHall";
		} 
	}
}


