package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import KGArtHall.model.ReserveInfo;
import KGArtHall.util.DBResourceReturn;

public class ConfirmDao {
	private static ConfirmDao confirmdao = new ConfirmDao();

	private ConfirmDao() {
	}

	public static ConfirmDao getInstance() {
		return confirmdao;
	}

	@SuppressWarnings("null")
	public List<ReserveInfo> confirm(Connection conn, String loginid) throws SQLException {
		PreparedStatement pstate = null;
		ResultSet rs = null;
		List<ReserveInfo> reserveinfo = new LinkedList<ReserveInfo>();
		try {
			pstate = conn.prepareStatement("SELECT * FROM KGART_RESERVEINFO WHERE ID = ?");
			pstate.setString(1, loginid);
			rs = pstate.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(loginid)) {
					reserveinfo.add(new ReserveInfo(
							rs.getString(2),
							rs.getDate(3),
							rs.getInt(4),
							rs.getInt(5)));
					// reserveinfo[i].setDate((java.util.Date) rs.getDate(3));
					// reserveinfo[i].setNumber(rs.getInt(4));
					// reserveinfo[i].setReserveno(rs.getInt(5));
				}
			}

		} finally {
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstate);
		}
		return reserveinfo;
	}
}
