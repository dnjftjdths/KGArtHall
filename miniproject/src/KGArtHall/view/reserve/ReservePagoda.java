package KGArtHall.view.reserve;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

import KGArtHall.Dao.ReserveDao;
import KGArtHall.util.DBConnection;
import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

import javax.swing.border.LineBorder;

public class ReservePagoda extends JPanel {
	private static final long serialVersionUID = 1L;
	private JDateChooser dateChooser;

	Display view;
	public Date min;
	public JComboBox comboBox;
	public ReservePagoda(Display view) {
		setLayout(null);
		TitlePanel title = new TitlePanel(view);
		add(title);

		dateChooser = new JDateChooser();
		Calendar maxcal = Calendar.getInstance();
		maxcal.set(2019, 8 - 1, 31);
		Date max = new Date(maxcal.getTimeInMillis()); // Date(long date)
		dateChooser.setMaxSelectableDate(max);

		Calendar mincal = Calendar.getInstance();
		mincal.set(2019, 6 - 1, 1);
		min = new Date(mincal.getTimeInMillis());
		dateChooser.setMinSelectableDate(min);
		dateChooser.setDate(min);
		
		getDateChooser().setBounds(629, 256, 199, 29);
		add(getDateChooser());

		JButton paybutton = new JButton("\uACB0\uC81C");
		paybutton.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		paybutton.setBounds(698, 595, 122, 47);
		paybutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.reservedate = dateChooser.getDate();
				view.reservenumber = Integer.parseInt(comboBox.getSelectedItem().toString());
				view.change(view, "paypanel", "pagoda");
			}
		});

		add(paybutton);

		JLabel pricelabel = new JLabel("가격 : ");
		pricelabel.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		pricelabel.setBounds(697, 538, 300, 26);
		add(pricelabel);
		setSize(1280, 960);
		
		ReserveDao reserveDao = ReserveDao.getInstance();
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

		comboBox.setBounds(629, 349, 199, 29);
		comboBox.setBackground(Color.WHITE);
		// comboBox.setSelectedIndex(1);
		
		add(comboBox);
		DecimalFormat df = new DecimalFormat("#,###");
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(comboBox.getSelectedItem().toString());
				pricelabel.setText("가격 : 50,000 X " + num + " = " + df.format(50000 * num) + "원");
			}
		});

		JLabel datelabel = new JLabel("\uB0A0\uC9DC");
		datelabel.setBounds(542, 256, 57, 29);
		add(datelabel);

		JLabel numlabel = new JLabel("\uB9E4\uC218");
		numlabel.setBounds(542, 349, 57, 29);
		add(numlabel);

		Image poster = Toolkit.getDefaultToolkit().createImage("image\\pagodainfo.png");
		JLabel posterlabel = new JLabel(new ImageIcon(poster));
		posterlabel.setBackground(Color.WHITE);
		posterlabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		posterlabel.setBounds(117, 170, 400, 500);
		add(posterlabel);

		String attention = "* 유의 사항\n- 교환 및 환불은 불가능합니다.\n"
				+ "- 좌석은 선착순으로 배정됩니다.\n     티켓팅 : 공연 시작 1시간전\n     입장 : 공연 시작 20분 전";
		JLabel attention1 = new JLabel("* 유의 사항");
		attention1.setFont(new Font("나눔바른펜", Font.PLAIN, 20));
		attention1.setBounds(182, 700, 138, 30);

		JLabel attention2 = new JLabel("- 교환 및 환불은 불가능합니다.");
		attention2.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		attention2.setBounds(195, 730, 326, 30);

		JLabel attention3 = new JLabel("- 좌석은 선착순으로 배정됩니다.");
		attention3.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		attention3.setBounds(195, 760, 326, 30);

		JLabel attention4 = new JLabel("     티켓팅 : 공연 시작 1시간전");
		attention4.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		attention4.setBounds(195, 790, 326, 30);

		JLabel attention5 = new JLabel("     입장 : 공연 시작 20분 전");
		attention5.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		attention5.setBounds(195, 820, 326, 30);

		add(attention1);
		add(attention2);
		add(attention3);
		add(attention4);
		add(attention5);

		JButton backbutton = new JButton("\u2190");
		backbutton.setFont(new Font("나눔고딕", Font.BOLD, 30));
		backbutton.setBackground(Color.DARK_GRAY);
		backbutton.setBounds(10, 160, 68, 58);
		backbutton.setForeground(Color.WHITE);
		add(backbutton);
		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.change("infopagoda");
			}
		});
		setVisible(true);
	}

	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public void setDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
	}
	
}
