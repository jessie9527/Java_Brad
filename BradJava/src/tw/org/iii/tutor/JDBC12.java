package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class JDBC12 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/northwind";

	public static void main(String[] args) {
		// sql語法
		String sql = 
				"SELECT e.FirstName, e.LastName, SUM(`order details`.`UnitPrice` * `order details`.`Quantity`) AS `SUM` "
				+ "from orders o "
				+ "join employees e on (o.EmployeeID = e.EmployeeID) "
				+ "JOIN `order details` ON (o.OrderID = `order details`.`OrderID`) "
				+ "GROUP BY e.FirstName, e.LastName "
				+ "ORDER BY `SUM` DESC";
		
		// 登入資料庫
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// resultset是一種存放資料庫結果的表格(table)，這個結果通常是經由執行SQL語法詢問資料庫所得出的
			ResultSet rs = pstmt.executeQuery();
			
			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			int rank = 1;
			while (rs.next()) {
				String firstName = rs.getString("Firstname");
				String lastName = rs.getString("Lastname");
				double sum = rs.getDouble("sum");
				
				jw.object();
				jw.key("rank").value(rank++);
				jw.key("firstname").value(firstName);
				jw.key("lastname").value(lastName);
				jw.key("sum").value(sum);
				jw.endObject();
			}
			
			jw.endArray();
			System.out.println(jw.toString());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
