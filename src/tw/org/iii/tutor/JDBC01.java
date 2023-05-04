package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		// 驅動程式
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 驅動程式載入
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii?user=root&password=root");
			// java跟mysql說話, mysql連結自己的localhost, port號是3306, mysql裡的資料庫iii, 帳號密碼
			
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('aa','123','1999-01-02')";
			if (stmt.execute(sql)) {
				System.out.println("Query");
			}else {
				System.out.println("Update");				
			}
			
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
