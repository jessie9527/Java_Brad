package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC17 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_QUERT = "SELECT * FROM cust";
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(
					SQL_QUERT, 
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("cname");
				System.out.printf("%s:%s\n", id ,name);
			}
			System.out.println("----");
			
			if (rs.first()) {
				System.out.println("move first OK");
				String id = rs.getString("id");
				String name = rs.getString("cname");
				System.out.printf("%s:%s\n", id ,name);
				
				rs.absolute(3);
				String id4 = rs.getString("id");
				String name4 = rs.getString("cname");
				System.out.printf("%s:%s\n", id4 ,name4);
			}else {
				System.out.println("OK");
			}
			System.out.println("----");
			
			// 修改資料
			rs.updateString("cname", "new aa");
			rs.updateString("tel", "789");
			rs.updateRow();
			
			System.out.println("----");
			// 刪除
			rs.absolute(2);
			String id = rs.getString("id");
			String name = rs.getString("cname");
			System.out.printf("%s:%s\n", id ,name);
			// 刪除id=2
//			rs.deleteRow();
			// 指標指到id = 1
			String id4 = rs.getString("id");
			String name4 = rs.getString("cname");
			System.out.printf("%s:%s\n", id4 ,name4);
			System.out.println("----");
			
			// 游標會移到一個空的、可編輯的新記錄的位置
			rs.moveToInsertRow();
			rs.updateString("cname", "new aa");
			rs.updateString("tel", "1234567");
			rs.updateString("birthday", "1999-01-02");
			rs.insertRow();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
