package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import KGArtHall.Dao.ConfirmDao;
import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class ConfirmService {
	private static ConfirmService confirmservice = new ConfirmService();
	private ConfirmService() {}
	public static ConfirmService getInstance() {
		return confirmservice;
	}
	
	public List<ReserveInfo> confirm(String loginid) {
		Connection conn = null;
		List<ReserveInfo> reserveinfo = null;
		try {
			conn = DBConnection.getConn();
			conn.setAutoCommit(true);
			ConfirmDao confirmDao = ConfirmDao.getInstance();
			reserveinfo = confirmDao.confirm(conn, loginid);
			
		} catch(SQLException e) {
			System.out.println("로딩 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
		return reserveinfo;
	}
}
