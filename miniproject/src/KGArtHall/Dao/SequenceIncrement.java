package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SequenceIncrement {
	private static Statement stmt = null;
	// 잘못 입력된 경우에 STDNO가 증가하지 않고 기존 값을 유지하도록 하는 메소드
	public static void idMinus(Connection conn) throws SQLException {
		stmt = conn.createStatement();
		stmt.execute("ALTER SEQUENCE RES_NO INCREMENT BY -1");		// 1씩 감소하는 수열 생성
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("SELECT RES_NO.NEXTVAL FROM DUAL");		// 기존 값에서 -1된 값 배정(DUAL이 레코드 1개이므로)
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("ALTER SEQUENCE RES_NO INCREMENT BY 1");	// 1씩 증가하는 수열로 변경(기존 값에서 1 작아짐)
		stmt.close();
	}
}
