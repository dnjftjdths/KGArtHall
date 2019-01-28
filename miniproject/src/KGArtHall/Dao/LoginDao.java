package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import KGArtHall.util.DBResourceReturn;

public class LoginDao {
	private static LoginDao loginDao = new LoginDao();
	private LoginDao() {}
	public static LoginDao getInstance() {
		return loginDao;
	}
	
	public static String name = "";
	
	public String login(Connection conn, String id, String pw) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String result = "";
		try {
			pstmt = conn.prepareStatement("SELECT ID, PW, NAME FROM KGART_USERINFO");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String dbid = rs.getString(1);
				String dbpw = rs.getString(2);
				if(dbid.equals(id)) {
					if(dbpw.equals(pw)) {
						System.out.println("로그인이 완료되었습니다.");
						name = rs.getString(3);
						result = rs.getString(1);	break;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						result = "wrongpw"; break;
					}
				}
			}
		} finally {
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstmt);
		}
		return result;
	}
}
