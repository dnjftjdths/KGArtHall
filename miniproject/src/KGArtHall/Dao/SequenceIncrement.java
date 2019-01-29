package KGArtHall.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SequenceIncrement {
	private static Statement stmt = null;
	// �߸� �Էµ� ��쿡 STDNO�� �������� �ʰ� ���� ���� �����ϵ��� �ϴ� �޼ҵ�
	public static void idMinus(Connection conn) throws SQLException {
		stmt = conn.createStatement();
		stmt.execute("ALTER SEQUENCE RES_NO INCREMENT BY -1");		// 1�� �����ϴ� ���� ����
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("SELECT RES_NO.NEXTVAL FROM DUAL");		// ���� ������ -1�� �� ����(DUAL�� ���ڵ� 1���̹Ƿ�)
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("ALTER SEQUENCE RES_NO INCREMENT BY 1");	// 1�� �����ϴ� ������ ����(���� ������ 1 �۾���)
		stmt.close();
	}
}
