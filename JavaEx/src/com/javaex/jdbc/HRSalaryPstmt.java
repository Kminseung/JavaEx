package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

// 실습 3. 사용자로부터 최소, 최대 급여를 입력 받아 급여 범위 내의 정보 출력
public class HRSalaryPstmt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;	// SELECT 문 실행 결과 저장
		
		System.out.print("최소금액을 입력하시오 : ");
		int minSalary = s.nextInt();
		System.out.print("최대금액을 입력하시오 : ");
		int maxSalary = s.nextInt();

		if(minSalary > maxSalary) {
			int tmp = minSalary;
			minSalary = maxSalary;
			maxSalary = tmp;
		}
		
		s.close();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			// 동적으로 데이터 연결 공간을 ?로 비워둠
			String sql = "SELECT first_name, last_name, salary " +
					"FROM employees " + 
					"WHERE salary BETWEEN ? AND ? " + 
					"ORDER BY salary";
			pstmt = conn.prepareStatement(sql);	// 실행 계획 준비
			
			// 동적 파라미터 설정
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			// 쿼리 수행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s %s : %d%n", rs.getString(1), rs.getString(2), 
						rs.getInt(3));
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
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
