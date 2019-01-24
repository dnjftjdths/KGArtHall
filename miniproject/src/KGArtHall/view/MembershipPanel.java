package KGArtHall.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import KGArtHall.model.UserInfo;
import KGArtHall.service.SaveService;
import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class MembershipPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	static JTextField inputname = new JTextField("");
	static JTextField inputid = new JTextField("");
	static JPasswordField inputpw = new JPasswordField("");
	static JPasswordField inputrepw = new JPasswordField("");
	static JTextField inputtel = new JTextField("");
	static JTextField inputemail = new JTextField("");
	static JTextField inputadd = new JTextField("");
	
	public MembershipPanel(Display view) {

		TitlePanel title = new TitlePanel(view);
		JLabel name = new JLabel("*이름");
		JLabel id = new JLabel("*아이디");
		JLabel pw = new JLabel("*비밀번호");
		JLabel repw = new JLabel("*비밀번호확인");
		JLabel tel = new JLabel("*전화번호");
		JLabel email = new JLabel("  이메일");
		JLabel add = new JLabel("  주소(ex. 서울)");

		JButton overlapid = new JButton("중복확인");
		JButton complete = new JButton("가입");

		// 라벨
		name.setBounds(300, 150, 200, 100);
		id.setBounds(300, 220, 200, 100);
		pw.setBounds(300, 290, 200, 100);
		repw.setBounds(300, 360, 200, 100);
		tel.setBounds(300, 430, 200, 100);
		email.setBounds(300, 500, 200, 100);
		add.setBounds(300, 570, 200, 100);

		// 텍스트
		inputname.setBounds(500, 180, 200, 40);
		inputid.setBounds(500, 250, 200, 40);
		inputpw.setBounds(500, 320, 200, 40);
		inputrepw.setBounds(500, 390, 200, 40);
		inputtel.setBounds(500, 460, 200, 40);
		inputemail.setBounds(500, 530, 200, 40);
		inputadd.setBounds(500, 600, 200, 40);

		// 글씨 크기 변경
		name.setFont(name.getFont().deriveFont(20.0f));
		id.setFont(id.getFont().deriveFont(20.0f));
		pw.setFont(pw.getFont().deriveFont(20.0f));
		repw.setFont(repw.getFont().deriveFont(20.0f));
		tel.setFont(tel.getFont().deriveFont(20.0f));
		email.setFont(email.getFont().deriveFont(20.0f));
		add.setFont(add.getFont().deriveFont(20.0f));

		// 버튼
		overlapid.setBounds(730, 250, 100, 40);
		complete.setBounds(600, 670, 100, 40);
		complete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserInfo userinfo = new UserInfo();
				userinfo.setName(inputname.getText());
				userinfo.setId(inputid.getText());
				userinfo.setPw(new String(inputpw.getPassword()));
				userinfo.setTel(inputtel.getText());
				userinfo.setEmail(inputemail.getText());
				userinfo.setAdd(inputadd.getText());

				boolean idfinish = inputid.isEditable();
				SaveService saveservice = SaveService.getInstance();
				boolean telcheck = saveservice.service(userinfo.getTel(), "TEL");
				registcheck(view, userinfo, new String(inputrepw.getPassword()), idfinish, telcheck, saveservice);
			}
		});
		overlapid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = inputid.getText();
				SaveService saveservice = SaveService.getInstance();
				boolean check = saveservice.service(id, "ID");
				if (check == false) {
					JOptionPane.showMessageDialog(null, "사용할 수 없는 아이디입니다.", "Message", JOptionPane.WARNING_MESSAGE);
					inputid.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "사용할 수 있는 아이디입니다.");
					inputid.setEditable(false);
				}
			}
		});

		add(title);
		add(name);
		add(id);
		add(pw);
		add(repw);
		add(tel);
		add(email);
		add(add);

		add(inputname);
		add(inputid);
		add(inputpw);
		add(inputrepw);
		add(inputtel);
		add(inputemail);
		add(inputadd);

		add(overlapid);
		add(complete);

		setSize(1280, 960);
		setLayout(null);
		setVisible(true);
	}

	public static void registcheck(Display view ,UserInfo userinfo, String inputrepw, boolean idfinish, boolean telcheck, SaveService saveservice) {
		if(userinfo.getName().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(userinfo.getId().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(idfinish == true) {
			JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(userinfo.getPw().equals("") || inputrepw.equals("")) {
			JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.", "Messange", JOptionPane.WARNING_MESSAGE);
		} else if(userinfo.getId().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(userinfo.getTel().equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(!userinfo.getPw().equals(inputrepw)) {
			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "Message", JOptionPane.WARNING_MESSAGE);
		} else if(telcheck == false) {
			JOptionPane.showMessageDialog(null, "이미 등록된 전화번호입니다.", "Message", JOptionPane.WARNING_MESSAGE);
		} else {
			saveservice.save(userinfo);
			JOptionPane.showMessageDialog(null, "가입이 완료되었습니다.");
			view.change("mainview");
			setblank();
			inputid.setEditable(true);
		}
	}
	
	public static void setblank() {
		inputname.setText(""); inputid.setText("");
		inputpw.setText(""); inputrepw.setText("");
		inputtel.setText(""); inputemail.setText("");
		inputadd.setText("");
	}
}
