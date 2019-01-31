package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBResourceReturn;

public class DeleteDao {
	private static DeleteDao deseteDao = new DeleteDao();
	private DeleteDao() {}
	public static DeleteDao getInstance() {
		return deseteDao;
	}
	
	public void delete(Connection conn, ReserveInfo info) throws SQLException {
		PreparedStatement pstate = null;
		try{
			pstate = conn.prepareStatement("DELETE FROM KGART_RESERVEINFO WHERE RESERVENO = ?");
			pstate.setInt(1, info.getReserveno());
			int cnt = pstate.executeUpdate();
			if(cnt == 0) {
				System.out.println("예매가 취소되지 않았습니다.");
			}
		} finally {
			DBResourceReturn.close(pstate);
		}
	}
	
}
