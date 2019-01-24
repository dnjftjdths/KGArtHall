package KGArtHall.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

import javax.swing.JButton;
import java.awt.Font;

public class PayPanel extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;

	public PayPanel(Display view) {
		setLayout(null);
		
		// ∏ﬁ¿Œ»≠∏È¿∏∑Œ ¿Ãµø
		TitlePanel title = new TitlePanel(view);
		
		JLabel lblNewLabel = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638 \r\n");
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		lblNewLabel.setBounds(432, 293, 150, 52);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(432, 385, 121, 22);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uC644\uB8CC");
		btnNewButton.setBounds(669, 484, 142, 39);
		add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		textField_1.setBounds(620, 300, 194, 39);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(620, 379, 194, 39);
		add(textField_2);
		textField_2.setColumns(10);
		
		
		add(title);
		
		setVisible(true);
		setSize(1280,960);
		setLayout(null);
		
	}
}
