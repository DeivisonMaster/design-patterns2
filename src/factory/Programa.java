package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		
		PreparedStatement ps  = conn.prepareStatement("select * from tabela");
		
	}
}
