package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public boolean overlapcheck(Connection conn, String ch, String var) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			boolean check = true;
			try {
				if(var.equals("ID")) {
					pstmt = conn.prepareStatement("SELECT ID FROM KGART_USERINFO");
				} else if(var.equals("TEL")) {
					pstmt = conn.prepareStatement("SELECT TEL FROM KGART_USERINFO");
				}
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String dbch = rs.getString(1);
					if(dbch.equals(ch)) {
						System.out.println(var + "가 중복됩니다.");
						check = false;	break;
					}
				}
		} finally{
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstmt);
		}
		return check;
	}
}
