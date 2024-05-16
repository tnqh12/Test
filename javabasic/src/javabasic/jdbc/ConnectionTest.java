package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	
	public static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static final String USER_ID = "lsb";
	public static final String	USER_PASS = "1234"; 
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection (JDBC_URL,USER_ID,USER_PASS);
			if (conn != null) {
				System.out.println("오라클 연결");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
