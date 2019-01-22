package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.UserInfoDao;
import KGArtHall.model.UserInfo;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class SaveService {
	private static SaveService saveService = new SaveService();
	private SaveService() {}
	public static SaveService getInstance() {
		return saveService;
	}
	
	public void save(UserInfo userinfo) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			UserInfoDao userinfoDao = UserInfoDao.getInstance();
			userinfoDao.insert(conn, userinfo);
		} catch(SQLException e) {
			System.out.println("저장 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
