package KGArtHall.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import KGArtHall.view.main.Display;

public class TicketFrame extends JFrame {

	private JPanel contentPane;
	public static String ticketname = "";
	public static String ticketplace = "";
	
	public TicketFrame(Display view, String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel ticketpanel = new JPanel();
		ticketpanel.setBackground(Color.WHITE);
		ticketpanel.setBounds(15, 15, 550, 168);
		contentPane.add(ticketpanel);
		ticketpanel.setBorder(new LineBorder(new Color(221, 160, 221), 4));
		ticketpanel.setLayout(null);
		
		ticketchange(name);
		JLabel Titlelabel = new JLabel(ticketname);
		Titlelabel.setFont(new Font("����", Font.BOLD, 15));
		Titlelabel.setBounds(190, 22, 300, 29);
		ticketpanel.add(Titlelabel);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MMM dd�� E����");
		JLabel datelabel = new JLabel("\uC77C\uC2DC : " + sdf.format(view.reservedate));
		datelabel.setBounds(249, 90, 211, 15);
		ticketpanel.add(datelabel);

		JLabel placelabel = new JLabel("\uC7A5\uC18C : " + ticketplace);
		placelabel.setBounds(249, 115, 211, 15);
		ticketpanel.add(placelabel);

		JLabel numlabel = new JLabel("\uC608\uB9E4 \uBC88\uD638 : ");
		numlabel.setBounds(249, 61, 211, 15);
		ticketpanel.add(numlabel);

		Image poster = Toolkit.getDefaultToolkit().createImage("image\\ticket" + name +".png");
		JLabel posterlabel = new JLabel(new ImageIcon(poster));
		posterlabel.setBackground(Color.WHITE);
		posterlabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		posterlabel.setBounds(27, 22, 120, 124);
		ticketpanel.add(posterlabel);

		// ���
		JButton printbutton = new JButton("\uCD9C\uB825");
		printbutton.setBounds(300, 204, 97, 23);
		printbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintLoading m = new PrintLoading();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				m.iterate();
			}

		});
		JButton disposebutton = new JButton("����");
		disposebutton.setBounds(450, 204, 97, 23);
		disposebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (view.loginid.equals("")) {
					view.change("mainview");
				} else {
					view.change(view, view.mainview.idpw.loginpanel, view.loginid);
				}
			}
		});
		contentPane.add(printbutton);
		contentPane.add(disposebutton);
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
