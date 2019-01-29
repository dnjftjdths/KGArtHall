package KGArtHall.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연결 객체를 반환하는 클래스
public class DBConnection {
	private static Connection conn = null;

	public static Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId="SCHOOL";		// selection 예제에서는 scott
				String userPw = "kg";		// selection 예제에서는 kg
				// String userId="ITBANK";
				// String userPw = "PAGODA";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				// String url = "jdbc:oracle:thin:@DESKTOP-OPLFPOO:1521:orcl";
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (SQLException e) {
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 로딩할 수 없습니다.");
		}
		return conn;		// null 또는 연결 객체를 반환
	}
	
	
	
}
