package sub2;
/*
 * 날짜 : 2024/07/29
 * 이름 : 박수정
 * 내용 : Delete 실습하기 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";

		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 2단계 - SQL 실행 객체 statement 생성
			Statement stmt = conn.createStatement();

			// 3단계 - SQL 실행
			stmt.executeUpdate("Delete from `user1` where `uid` = 'J101'");

			// 4단계 - Resultset 결과처리(Select일 경우)

			// 5단계 - 접속 종료
			conn.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Delete 완료...");
	}

}
