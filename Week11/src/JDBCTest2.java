import java.sql.*;

public class JDBCTest2 {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/haska?";
		String id = "root";
		String pw = "1234";
		
		Statement stmt;
		ResultSet result;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결 완료");
			
			stmt = conn.createStatement();
			// createStatement() 메소드를 사용하여 Statement 객체를 반환
			
			stmt.executeUpdate("insert into std values(2022051111, 'pklee', 'Management', 90, 3)");
			stmt.executeUpdate("insert into std values(2021981133, 'sdkim', 'Music', 100, 1)");
			stmt.executeUpdate("insert into std values(2022951141, 'chlim', 'FineArt', 99, 2)");
			
			result = stmt.executeQuery("select * from std");
			
			
			while (result.next()) {
				int hakbun = result.getInt(1); // 인덱스
				String name = result.getString("name");
				String dept = result.getString("dept");
				int score = result.getInt(4);
				int grade = result.getInt("grade");
				System.out.println(hakbun + " " + name + " " + dept + " " + score + " " + grade); 
			}
		result.close();
		stmt.close();
		conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	
	}
}
