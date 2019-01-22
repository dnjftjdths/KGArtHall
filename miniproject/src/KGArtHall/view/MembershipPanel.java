package KGArtHall.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MembershipPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	MembershipPanel(Display view){
			
			JLabel name = new JLabel("*NAME");
			JLabel id = new JLabel("*ID");
			JLabel pw = new JLabel("*PW");
			JLabel repw = new JLabel("*REPW");
			JLabel tel = new JLabel("*TEL");
			JLabel email = new JLabel("EMAIL");
			JLabel add = new JLabel("ADD");
			
			JTextField inputname = new JTextField();
			JTextField inputid = new JTextField();
			JTextField inputpw = new JTextField();
			JTextField inputrepw = new JTextField();
			JTextField inputtel = new JTextField();
			JTextField inputemail = new JTextField();
			JTextField inputadd = new JTextField();
			
			name.setBounds(40, 20, 100, 40);
			id.setBounds(40, 20, 100, 40);
			pw.setBounds(40, 20, 100, 40);
			repw.setBounds(40, 20, 100, 40);
			tel.setBounds(40, 20, 100, 40);
			email.setBounds(40, 20, 100, 40);
			add.setBounds(40, 20, 100, 40);
			
			inputname.setBounds(130, 20, 200, 40);
			inputid.setBounds(130, 20, 200, 40);
			inputpw.setBounds(130, 20, 200, 40);
			inputrepw.setBounds(130, 20, 200, 40);
			inputtel.setBounds(130, 20, 200, 40);
			inputemail.setBounds(130, 20, 200, 40);
			inputadd.setBounds(130, 20, 200, 40);
			
			
			add(name); add(id); add(pw); add(repw);
			add(tel); add(email); add(add);
			
			setSize(1280,960);
			setLayout(null);
			setVisible(true);
		}
	}
