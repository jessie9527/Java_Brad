package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC06 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			// SELECT FROM food;
			String sql = "SELECT * FROM food";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			
			// 先移動
//			result.next();
			// 在取得(型別是mysql的型別, java要用字串直接用即可, 不需要型別轉換)
//			System.out.println(result.getString("name"));
			
			// 用迴圈把欄位資料全部取出
			while (result.next()) {
				System.out.println(result.getString("name"));
			}
			
			// mysql自動關閉
			result.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
