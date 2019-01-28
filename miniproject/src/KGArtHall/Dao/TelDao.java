package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import KGArtHall.util.DBResourceReturn;

public class TelDao {
	private static TelDao TelDao = new TelDao();

	private TelDao() {
	}

	public static TelDao getInstance() {
		return TelDao;
	}

	public int telpw(Connection conn, String tel, String pw, String loginid) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement("SELECT TEL, PW, ID FROM KGART_USERINFO");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String dbtel = rs.getString(1);
				String dbpw = rs.getString(2);
				if (loginid.equals(rs.getString(3))) {
					if (dbtel.equals(tel) && dbpw.equals(pw)) {
						System.out.println("결제가 완료되었습니다.");
						result = 1;
						break;
					} else {
						System.out.println("정보가 틀렷습니다.");
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
