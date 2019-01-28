package KGArtHall.service;

import java.sql.Connection;
import java.sql.SQLException;

import KGArtHall.Dao.LoginDao;
import KGArtHall.util.DBConnection;
import KGArtHall.util.DBResourceReturn;

public class LoginService {
	private static LoginService loginService = new LoginService();
	private LoginService() {}
	public static LoginService getInstance() {
		return loginService;
	}
	
	public String name = "";
	public String login(String id, String pw) {
		Connection conn = null;
		String result = "";
		try {
			conn = DBConnection.getConn();
			LoginDao loginDao = LoginDao.getInstance();
			result = loginDao.login(conn, id, pw);
			name = LoginDao.name;
		} catch(SQLException e) {
			System.out.println("로딩 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
		return result;
	}
}
