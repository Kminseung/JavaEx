package com.javaex.jdbc;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		
		Statement stmt = null;	// SQL 실행을 위한 문맥 정보
		ResultSet rs = null;	// SELECT 문 실행 결과 저장
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			stmt = conn.createStatement();
			// 실행할 쿼리
			String sql = "SELECT department_id, department_name FROM departments";
			
			// 쿼리 실행
			rs = stmt.executeQuery(sql);
			
			// 레코드 출력
			while(rs.next()) {
				int deptID = rs.getInt(1); // 컬럼의 순서는 1부터
				String deptName = rs.getString("department_name");	// 컬럼의 이름으로 출력
			
				System.out.printf(" %d : %s%n", deptID, deptName);
			}
		}
		catch(ClassNotFoundException e) {
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
