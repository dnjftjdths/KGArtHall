package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBResourceReturn;

public class ReserveDao {
	private static ReserveDao reserveDao = new ReserveDao();
	private ReserveDao() {}
	public static ReserveDao getInstance() {
		return reserveDao;
	}
	
	public int reserve(Connection conn, ReserveInfo reserveinfo) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int n = 0, sum = 0;
		try {
			
			pstmt = conn.prepareStatement("INSERT INTO KGART_RESERVEINFO VALUES(?, ?, ?, ?, RES_NO.NEXTVAL)");
			pstmt.setString(1, reserveinfo.getId());
			pstmt.setString(2, reserveinfo.getName());
			java.sql.Date d = new java.sql.Date(reserveinfo.getDate().getTime());
			pstmt.setDate(3, d);
			pstmt.setInt(4, reserveinfo.getNumber());
			pstmt.executeUpdate();
			System.out.println("저장이 완료되었습니다.1");
			pstmt.close();
			
			pstmt = conn.prepareStatement("SELECT MAX(RESERVENO) FROM KGART_RESERVEINFO",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			n = rs.last() ? rs.getInt(1) : 1;
		} finally {
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstmt);
		}
		return n;
	}
	
	public int reservednum(Connection conn, Date date, String name) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int sum = 0, left = 20;
		
		try {
			pstmt = conn.prepareStatement("SELECT SUM(ARTNUMBER) FROM KGART_RESERVEINFO WHERE ARTNAME = ? AND ARTDATE = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setString(1, name);
			java.sql.Date d = new java.sql.Date(date.getTime());
			pstmt.setDate(2, d);
			rs = pstmt.executeQuery();
			sum = rs.last() ? rs.getInt(1) : 0;
			
			System.out.println(sum);
			left = 20 - sum;
			if(left < 0) {
				System.out.println("잔여석이 없습니다.");
				left = 0;
			}
		} catch(SQLException e){
			System.out.println("로딩 실패");
		} finally {
				DBResourceReturn.close(rs);
				DBResourceReturn.close(pstmt);
				DBResourceReturn.close(conn);
		}
		return left;
	}
}
