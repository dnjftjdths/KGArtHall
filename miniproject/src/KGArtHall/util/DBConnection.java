package KGArtHall.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB ���� ��ü�� ��ȯ�ϴ� Ŭ����
public class DBConnection {
	private static Connection conn = null;

	public static Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId="SCHOOL";		// selection ���������� scott
				String userPw = "kg";		// selection ���������� kg
				// String userId="ITBANK";
				// String userPw = "PAGODA";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				// String url = "jdbc:oracle:thin:@DESKTOP-OPLFPOO:1521:orcl";
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (SQLException e) {
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� �ε��� �� �����ϴ�.");
		}
		return conn;		// null �Ǵ� ���� ��ü�� ��ȯ
	}
	
	
	
}
