package KGArtHall.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import KGArtHall.view.main.Display;
import KGArtHall.view.main.MainView;

public class TicketFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketFrame frame = new TicketFrame();
					frame.setTitle("Ticket");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TicketFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ticketpanel = new JPanel();
		ticketpanel.setBackground(Color.WHITE);
		ticketpanel.setBounds(15, 15, 550, 168);
		contentPane.add(ticketpanel);
		ticketpanel.setBorder(new LineBorder(new Color(221, 160, 221), 4));
		ticketpanel.setLayout(null);
		
		JLabel Titlelabel = new JLabel("\uD30C\uACE0\uB2E4\uC758 \uC800\uC8FC");
		Titlelabel.setFont(new Font("굴림", Font.BOLD, 15));
		Titlelabel.setBounds(190, 22, 148, 29);
		ticketpanel.add(Titlelabel);
		
		JLabel datelabel = new JLabel("\uC77C\uC2DC : ");
		datelabel.setBounds(249, 90, 211, 15);
		ticketpanel.add(datelabel);
		
		JLabel placelabel = new JLabel("\uC7A5\uC18C : ");
		placelabel.setBounds(249, 115, 211, 15);
		ticketpanel.add(placelabel);
		
		JLabel numlabel = new JLabel("\uC608\uB9E4 \uBC88\uD638 : ");
		numlabel.setBounds(249, 61, 211, 15);
		ticketpanel.add(numlabel);
		
		Image poster = Toolkit.getDefaultToolkit().createImage("image\\posterimage1.png");
		JLabel posterlabel = new JLabel(new ImageIcon(poster));
		posterlabel.setBackground(Color.WHITE);
		posterlabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		posterlabel.setBounds(27, 22, 120, 124);
		ticketpanel.add(posterlabel);
		
		JButton printbutton = new JButton("\uCD9C\uB825");
		printbutton.setBounds(468, 204, 97, 23);
		printbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintLoading m = new PrintLoading();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				m.iterate();
				// JOptionPane.showMessageDialog(null, "티켓이 출력되었습니다.");
			}
		});
		contentPane.add(printbutton);
	}
}
