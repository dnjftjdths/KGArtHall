package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.TelDao;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class TelService {
	private static TelService TelService = new TelService();
	private TelService() {}
	public static TelService getInstance() {
		return TelService;
	}
	
	public String tel = "";
	public int telpw(String tel,String pw) {
		Connection conn = null;
		int result = 0;
		try {
			conn = DBConnection.getConn();
			TelDao telDao = TelDao.getInstance();
			result = telDao.telpw(conn,tel,pw);
			
		} catch(SQLException e) {
			System.out.println("인증 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
		return result;
	}
	
}
