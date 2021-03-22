package com.javaex.jdbc;

import java.sql.*;

// 실습 1. hr 계정의 사원 이름과 매니저 이름 출력
public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;	// SQL 실행을 위한 문맥 정보
		ResultSet rs = null;	// SELECT 문 실행 결과 저장
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			String sql = "SELECT emp.first_name || ' ' || emp.last_name as name, " +
					"mgr.first_name || ' ' || mgr.last_name as mgr_name " + 
					"FROM employees emp, employees mgr " +
					"WHERE emp.manager_id = mgr.employee_id " +
					"ORDER BY name DESC";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String empName = rs.getString("name");
				String mgrName = rs.getString(2);
				
				System.out.printf("Name : %s, Manager : %s%n", empName, mgrName);
			}
		}
		catch(ClassNotFoundException e ) {
			System.err.println("드라이버 로드 실패");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
