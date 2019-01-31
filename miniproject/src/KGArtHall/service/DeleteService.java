package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.DeleteDao;
import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class DeleteService {
	private static DeleteService deleteservice = new DeleteService();
	private DeleteService() {}
	public static DeleteService getInstance() {
		return deleteservice;
	}
	
	public void delete(ReserveInfo info) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			DeleteDao deletedao = DeleteDao.getInstance();
			deletedao.delete(conn, info);
		} catch(SQLException e) {
			System.out.println("로딩 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
