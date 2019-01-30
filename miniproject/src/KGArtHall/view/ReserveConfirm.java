package KGArtHall.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import KGArtHall.model.ReserveInfo;
import KGArtHall.view.main.Display;
import KGArtHall.view.main.TitlePanel;

public class ReserveConfirm extends JPanel {

	public ReserveConfirm(Display view, List<ReserveInfo> reserveinfo) {
		TitlePanel titlepanel = new TitlePanel(view);
		add(titlepanel);

		JLabel reservenolabel = new JLabel("���� ��ȣ");
		reservenolabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		reservenolabel.setBounds(300, 220, 80, 30);
		add(reservenolabel);

		JLabel reservenamelabel = new JLabel("����");
		reservenamelabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		reservenamelabel.setBounds(700, 220, 80, 30);
		add(reservenamelabel);

		if (reserveinfo.isEmpty()) {
			JLabel noreservelabel = new JLabel("���� ������ �����ϴ�.");
			noreservelabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
			noreservelabel.setBounds(500, 310, 200, 30);
			add(noreservelabel);
		} else {
			for (int i = 0; i < reserveinfo.size(); i++) {
				ReserveInfo info = reserveinfo.get(i);
				JLabel reserveno = new JLabel(info.getName().toUpperCase() + info.getReserveno());
				reserveno.setFont(new Font("����", Font.PLAIN, 15));
				reserveno.setBounds(300, 280 + i * 40, 200, 30);
				add(reserveno);

				JButton reservename = new JButton(reservename(info.getName()));
				reservename.setFont(new Font("����", Font.PLAIN, 15));
				reservename.setBounds(700, 280 + i * 40, 300, 30);
				reservename.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				add(reservename);
			}
		}
		setSize(1280, 960);
		setVisible(true);
		setLayout(null);
	}
	
	public String reservename(String name) {
		if(name.equals("pagoda"))				return "�İ���� ����";
		else if(name.equals("jawsbar"))			return "�� �ܿ�, ���� �ӱ��� �ҽ���";
		else if(name.equals("marathon"))		return "Green Marathon";
		else if(name.equals("thisjava"))		return "�̰��� �ڹٴ�";
		else if(name.equals("basketball"))		return "������ �ƴ�, ��������";
		else if(name.equals("presentation"))	return "������Ʈ ��ǥȸ";
		return "";
	}
}
