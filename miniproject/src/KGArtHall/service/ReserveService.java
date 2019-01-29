package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.ReserveDao;
import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class ReserveService {
	private static ReserveService reserveservice = new ReserveService();
	private ReserveService() {}
	public static ReserveService getInstance() {
		return reserveservice;
	}
	
	public void reserve(ReserveInfo reserveinfo) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			ReserveDao reserveDao = ReserveDao.getInstance();
			reserveDao.reserve(conn, reserveinfo);
		} catch(SQLException e) {
			System.out.println("로딩 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
