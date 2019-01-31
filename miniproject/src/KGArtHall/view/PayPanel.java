package KGArtHall.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import KGArtHall.Dao.ReserveDao;
import KGArtHall.model.ReserveInfo;
import KGArtHall.service.ReserveService;
import KGArtHall.service.TelService;
import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class PayPanel extends JPanel {
	private JTextField inputtel;
	private JPasswordField inputpw;
	

	public PayPanel(Display view, String name) {
		setLayout(null);
		
		// 메인화면으로 이동
		TitlePanel title = new TitlePanel(view);
		
		JLabel lblNewLabel = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638 \r\n");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(432, 293, 150, 52);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(432, 385, 121, 22);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uC644\uB8CC");
		btnNewButton.setBounds(669, 484, 142, 39);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String TELinput = inputtel.getText();
				String PWinput = new String(inputpw.getPassword());
				TelService telservice = TelService.getInstance();
				int n = telservice.telpw(TELinput,PWinput, view.loginid);
				if ( n == 1 ) {
					ReserveInfo reserveinfo = new ReserveInfo();
					reserveinfo.setId(view.loginid);
					reserveinfo.setName(name);
					reserveinfo.setDate(view.reservedate);
					reserveinfo.setNumber(view.reservenumber);
					ReserveService reserveService = ReserveService.getInstance();
					view.reserveno = name.toUpperCase() + reserveService.reserve(reserveinfo);
					
					System.out.println("결제가 완료되었습니다.");
					JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
					TicketFrame ticket = new TicketFrame(view, name);
					ticket.setLocationRelativeTo(null);
					ticket.setVisible(true);
				} else if( n == 0 ) {
					JOptionPane.showMessageDialog(null, "정보가 올바르지 않습니다.", "Message", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		add(btnNewButton);
		
		inputtel = new JTextField();
		inputtel.setFont(new Font("굴림", Font.PLAIN, 20));
		inputtel.setBounds(620, 300, 194, 39);
		add(inputtel);
		inputtel.setColumns(10);
		
		inputpw = new JPasswordField();
		inputpw.setBounds(620, 379, 194, 39);
		add(inputpw);
		inputpw.setColumns(10);
		
		BackPanel backpanel = new BackPanel(view, name);
		add(backpanel);
		add(title);
		
		setVisible(true);
		setSize(1280,960);
		setLayout(null);
		
	}
}
