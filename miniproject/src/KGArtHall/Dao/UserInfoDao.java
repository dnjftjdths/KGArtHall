package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import KGArtHall.model.UserInfo;
import KGArtHall.util.DBResourceReturn;

public class UserInfoDao {
	private static UserInfoDao userinfoDao = new UserInfoDao();
	private UserInfoDao() {}
	public static UserInfoDao getInstance() {
		return userinfoDao;
	}
	
	public int insert(Connection conn, UserInfo userinfo) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO KGART_USERINFO VALUES(?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, userinfo.getName());
			pstmt.setString(2, userinfo.getId());
			pstmt.setString(3, userinfo.getPw());
			pstmt.setString(4, userinfo.getTel());
			pstmt.setString(5, userinfo.getEmail());
			pstmt.setString(6, userinfo.getAdd());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}
