package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBResourceReturn;

public class ReserveDao {
	private static ReserveDao reserveDao = new ReserveDao();
	private ReserveDao() {}
	public static ReserveDao getInstance() {
		return reserveDao;
	}
	
	public void reserve(Connection conn, ReserveInfo reserveinfo) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO KGART_RESERVEINFO VALUES(?, ?, ?, ?, RES_NO.NEXTVAL)");
			pstmt.setString(1, reserveinfo.getId());
			pstmt.setString(2, reserveinfo.getName());
			java.sql.Date d = new java.sql.Date(reserveinfo.getDate().getTime());
			pstmt.setDate(3, d);
			pstmt.setInt(4, reserveinfo.getNumber());
			pstmt.executeUpdate();
			System.out.println("저장이 완료되었습니다.");
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}
