package KGArtHall.view.reserve;

import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class ReserveJawsbar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JDateChooser dateChooser;

	Display view;
	public ReserveJawsbar(Display view) {
		setLayout(null);
		
		TitlePanel title = new TitlePanel(view);
		add(title);
		JDateChooser dateChooser = new JDateChooser();
		Calendar maxcal = Calendar.getInstance();
		maxcal.set(2020, 2-1, 29);
		Date max = new Date(maxcal.getTimeInMillis()); // Date(long date)
		dateChooser.setMaxSelectableDate(max);
		
		Calendar mincal = Calendar.getInstance();
		mincal.set(2019, 12-1, 1);
		Date min = new Date(mincal.getTimeInMillis());
		dateChooser.setMinSelectableDate(min);
		dateChooser.setDate(min);
		
		dateChooser.setBounds(629, 256, 199, 29);
		add(dateChooser);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C");
		btnNewButton.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
		btnNewButton.setBounds(698, 595, 122, 47);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uACA9 : ");
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 20));
		lblNewLabel.setBounds(697, 538, 123, 26);
		add(lblNewLabel);
		setSize(1280, 960);
		setVisible(true);
	}
}
