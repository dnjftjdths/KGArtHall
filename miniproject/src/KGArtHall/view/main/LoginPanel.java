package KGArtHall.view.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import KGArtHall.model.ReserveInfo;
import KGArtHall.service.ConfirmService;
import KGArtHall.view.ReserveConfirm;
import java.awt.Font;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Display view;
	LoginPanel(Display view, String name) {
		setBackground(Color.LIGHT_GRAY);
		this.view = view;
		JLabel member = new JLabel(name + " ´Ô");
		member.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		member.setBounds(80, 20, 182, 40);

		JButton logout = new JButton("·Î±×¾Æ¿ô");
		logout.setBounds(73, 150, 140, 40);
		JButton registinfo = new JButton("¿¹¸Å Á¤º¸");
		registinfo.setBounds(236, 150, 140, 40);

		logout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// view.mainview.loginpanel.setVisible(false);
				view.change("mainview");
				view.loginid = "";
				IDPWPanel.inputid.setText("");
				IDPWPanel.inputpw.setText("");
			}
		});
		
		registinfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ConfirmService confirmservice = ConfirmService.getInstance();
				List<ReserveInfo> reserveinfo = confirmservice.confirm(view.loginid);
				view.reserveconfirm = new ReserveConfirm(view, reserveinfo);
				view.change("reserveconfirm");
			}
		});;
		setLayout(null);

		add(member);
		add(logout);
		add(registinfo);

		setBounds(30, 220, 400, 208);
		setVisible(true);
	}

}
