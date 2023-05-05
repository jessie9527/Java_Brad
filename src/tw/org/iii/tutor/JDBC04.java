package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC04 {

	public static void main(String[] args) {
		
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			
			String sql ="INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
			// PreparedStatement:防隱碼攻擊
			// 資料型態 變數 = Connection的prepareStatement(sql)方法
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// PreparedStatement物件就可以透過setXXX()的方法，將具體的參數值設定到問號位置
			pstmt.setString(1, "Brad");
			pstmt.setString(2, "345");
			pstmt.setString(3, "1998-03-04");
			// 執行這個SQL指令，將資料寫入資料庫中
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
