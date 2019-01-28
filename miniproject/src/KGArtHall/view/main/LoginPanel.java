package KGArtHall.view.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Display view;
	LoginPanel(Display view, String name) {
		this.view = view;
		JLabel member = new JLabel(name + " ´Ô");

		JButton logout = new JButton("·Î±×¾Æ¿ô");
		JButton registinfo = new JButton("¿¹¸Å Á¤º¸");

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
		member.setBounds(80, 20, 100, 40);

		logout.setBounds(40, 150, 140, 40);;
		registinfo.setBounds(200, 150, 140, 40);

		add(member);
		add(logout);
		add(registinfo);

		setBounds(30, 220, 400, 300);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}

}
