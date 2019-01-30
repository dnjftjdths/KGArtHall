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

		JLabel reservenolabel = new JLabel("예매 번호");
		reservenolabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		reservenolabel.setBounds(300, 220, 80, 30);
		add(reservenolabel);

		JLabel reservenamelabel = new JLabel("제목");
		reservenamelabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		reservenamelabel.setBounds(700, 220, 80, 30);
		add(reservenamelabel);

		if (reserveinfo.isEmpty()) {
			JLabel noreservelabel = new JLabel("예매 정보가 없습니다.");
			noreservelabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
			noreservelabel.setBounds(500, 310, 200, 30);
			add(noreservelabel);
		} else {
			for (int i = 0; i < reserveinfo.size(); i++) {
				ReserveInfo info = reserveinfo.get(i);
				JLabel reserveno = new JLabel(info.getName().toUpperCase() + info.getReserveno());
				reserveno.setFont(new Font("굴림", Font.PLAIN, 15));
				reserveno.setBounds(300, 280 + i * 40, 200, 30);
				add(reserveno);

				JButton reservename = new JButton(reservename(info.getName()));
				reservename.setFont(new Font("굴림", Font.PLAIN, 15));
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
		if(name.equals("pagoda"))				return "파고다의 저주";
		else if(name.equals("jawsbar"))			return "이 겨울, 눈꽃 머금은 죠스바";
		else if(name.equals("marathon"))		return "Green Marathon";
		else if(name.equals("thisjava"))		return "이것이 자바다";
		else if(name.equals("basketball"))		return "신장이 아닌, 심장으로";
		else if(name.equals("presentation"))	return "프로젝트 발표회";
		return "";
	}
}
