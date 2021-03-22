package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

// 실습 2. Scanner를 사용하여 사원 이름을 입력 받아 사원 정보 검색
// PreparedStatement를 이용한 실행 계획의 준비
public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		// Statement stmt = null;	// SQL 실행을 위한 문맥 정보
		PreparedStatement pstmt = null;
		ResultSet rs = null;	// SELECT 문 실행 결과 저장
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.print("검색할 사원의 이름을 입력하시오 : ");
			String inputName = s.next();
//			String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +
//					"FROM employees " +
//					"WHERE lower(first_name) LIKE '%" + inputName + "%' OR " +
//					"lower(last_name) LIKE '%" + inputName + "%'";
//
//			stmt = conn.createStatement();
//			
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.printf("%s %s : %s, %s, %s%n", rs.getString(1), rs.getString(2), 
//						rs.getString(2), rs.getString("phone_number"), rs.getString("hire_date"));
//			}
			// 동적으로 데이터 연결 공간을 ?로 비워둠
			String sql = "SELECT first_name, last_name, " +
					"email, phone_number, hire_date FROM employees " + 
					"WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);	// 실행 계획 준비
			
			// 동적 파라미터 설정
			pstmt.setString(1,  "%" + inputName + "%");
			pstmt.setString(2,  "%" + inputName + "%");
			
			// 쿼리 수행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s %s : %s, %s, %s%n", rs.getString(1), rs.getString(2), 
						rs.getString(2), rs.getString("phone_number"), rs.getString("hire_date"));
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
				pstmt.close();
				conn.close();
				s.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
