package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost/banco";
	private String user = "root";
	private String pass = "123";
	private Connection	conn;
	
	public Connection	getConnection(){
		try {
			conn = DriverManager.getConnection(url, user, pass);
			
			return conn;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
