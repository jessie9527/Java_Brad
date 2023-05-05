package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {

		try {
			// Properties 用於表示一組（Key-Value Pair）
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			// 連結資料庫
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);

			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM cust WHERE id = 3";
			
			// executeUpdate：執行 INSERT、UPDATE 或 DELETE 語句，返回更新的行數。
			int count = stmt.executeUpdate(sql);
			System.out.println(count);

			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
