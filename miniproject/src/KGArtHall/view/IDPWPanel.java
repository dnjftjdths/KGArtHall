package KGArtHall.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class IDPWPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	IDPWPanel(){
		
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("PW");
		
		JTextField inputid = new JTextField();
		JPasswordField inputpw = new JPasswordField();
		JButton login = new JButton("로그인");
		JButton regist = new JButton("회원가입");
		JButton registinfo = new JButton("예매 정보");
		
		id.setBounds(40, 20, 100, 40);
		pw.setBounds(40, 75, 100, 40);
		
		inputid.setBounds(130, 20, 200, 40);
		inputpw.setBounds(130, 75, 200, 40);
		login.setBounds(40, 150, 140, 40);
		regist.setBounds(200, 150, 140, 40);
		registinfo.setBounds(40, 200, 300, 40);
		
		add(id);	add(pw);	add(login);		add(regist);
		add(inputid);	add(inputpw);	add(registinfo);
		setBounds(30, 220, 400, 300);
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
}
