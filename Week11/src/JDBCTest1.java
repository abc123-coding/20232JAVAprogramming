import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// java sql 패키지의 클라스들을 import

public class JDBCTest1 {
	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/haska?";
		// 내 컴퓨터에 저장한 Haksa 데이터베이스와 연결하기 위한 url
		
		String id = "root";
		String pw = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결완료");
			
		}catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		}catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
	}

}
