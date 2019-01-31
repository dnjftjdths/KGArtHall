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
		Titlelabel.setFont(new Font("굴림", Font.BOLD, 15));
		Titlelabel.setBounds(249, 22, 300, 29);
		ticketpanel.add(Titlelabel);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MMM dd일 E요일");
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
		
		JLabel numlabel = new JLabel("매수 : " + info.getNumber());
		numlabel.setBounds(249, 140, 211, 15);
		ticketpanel.add(numlabel);

		// 예매취소
		JButton printbutton = new JButton("예매취소");
		printbutton.setBounds(300, 250, 97, 23);
		printbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteService deleteservice = DeleteService.getInstance();
				deleteservice.delete(info);
				JOptionPane.showMessageDialog(null, "예매가 취소되었습니다.");
				ConfirmService confirmservice = ConfirmService.getInstance();
				List<ReserveInfo> reserveinfo = confirmservice.confirm(view.loginid);
				view.reserveconfirm = new ReserveConfirm(view, reserveinfo);
				view.change("reserveconfirm");
				dispose();
			}

		});
	
		JButton disposebutton = new JButton("종료");
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
			ticketname = "파고다의 저주";
			ticketplace = "KGArtHall 601호";
		}
		else if(name.equals("jawsbar")) {
			ticketname = "이 겨울, 눈꽃 머금은 죠스바";
			ticketplace = "KGArtHall 501호";
		} 
		else if(name.equals("marathon")) {
			ticketname = "Green Marathon";
			ticketplace = "BEXCO";
		} 
		else if(name.equals("thisjava")) {
			ticketname = "이것이 자바다";
			ticketplace = "KGArtHall 502호";
		} 
		else if(name.equals("basketball")) {
			ticketname = "신장이 아닌, 심장으로";
			ticketplace = "경남 공업 고등학교 운동장";
		} 
		else if(name.equals("presentation")) {
			ticketname = "프로젝트 발표회";
			ticketplace = "KGArtHall";
		} 
	}
}


