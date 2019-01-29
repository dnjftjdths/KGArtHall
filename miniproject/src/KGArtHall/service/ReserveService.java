package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.ReserveDao;
import KGArtHall.Dao.SequenceIncrement;
import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class ReserveService {
	private static ReserveService reserveservice = new ReserveService();
	private ReserveService() {}
	public static ReserveService getInstance() {
		return reserveservice;
	}
	
	public int reserve(ReserveInfo reserveinfo) {
		Connection conn = null;
		int n = 0;
		try {
			conn = DBConnection.getConn();
			conn.setAutoCommit(false);
			ReserveDao reserveDao = ReserveDao.getInstance();
			n = reserveDao.reserve(conn, reserveinfo);
			
			conn.commit();
		} catch(SQLException e) {
			try {
				conn.rollback();
				SequenceIncrement.idMinus(conn);
			} catch(SQLException e1) {
				System.out.println(e1.getMessage());
			}
			System.out.println("로딩 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
		return n;
	}
}
