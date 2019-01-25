package KGArtHall.view.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import KGArtHall.service.LoginService;

public class IDPWPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Display view;
	static JTextField inputid = new JTextField();
	static JPasswordField inputpw = new JPasswordField();

	public LoginPanel loginpanel = null;
	IDPWPanel(Display view) {

		this.view = view;
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("PW");

		JButton login = new JButton("로그인");
		JButton regist = new JButton("회원가입");
		JButton registinfo = new JButton("예매 정보");

		regist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				view.change("membershippanel");
			}
		});

		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String IDinput = inputid.getText();
				String PWinput = new String(inputpw.getPassword());
				LoginService loginservice = LoginService.getInstance();
				int n = loginservice.login(IDinput, PWinput);
				loginmessage(n);
				if (n == 1) {
					loginpanel = new LoginPanel(view, loginservice.name);
					view.change(view, loginpanel);
				}
			}
		});
		id.setBounds(40, 20, 100, 40);
		pw.setBounds(40, 75, 100, 40);

		inputid.setBounds(130, 20, 200, 40);
		inputpw.setBounds(130, 75, 200, 40);
		login.setBounds(40, 150, 140, 40);
		regist.setBounds(200, 150, 140, 40);
		registinfo.setBounds(40, 200, 300, 40);

		add(id);
		add(pw);
		add(login);
		add(regist);
		add(inputid);
		add(inputpw);
		add(registinfo);
		setBounds(30, 220, 400, 300);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}

	public void loginmessage(int n) {
		if (n == 0) {
			JOptionPane.showMessageDialog(null, "등록되지 않은 아이디입니다.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if (n == 1) {
			JOptionPane.showMessageDialog(null, "로그인이 완료되었습니다.");
		} else if (n == 2) {
			JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "Message", JOptionPane.WARNING_MESSAGE);
		}
	}
}
