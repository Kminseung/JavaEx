package com.javaex.jdbc;

// sql 패키지 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	private static String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String DBUSER = "hr";	// 접속 계정
	private static String DBPASS = "hr";
	
	public static void main(String[] args) {
		// 2. 커넥션 확보
		Connection conn = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			System.out.println("접속 정보 : " + conn);
			System.out.println("연결 성공!");
		}
		catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		catch(SQLException e) {
			System.err.println("SQL ERROR!");
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
