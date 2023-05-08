package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.myclasses.BCrypt;

public class JDBC09 {
	private static Connection conn;
	// 把USER、PASSWORD、URL、SQL_CHECK、SQL_INSERT定義出來，下面程式碼直接帶參數
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_CHECK = 
			"SELECT count(*) count FROM member WHERE account = ?";
	private static final String SQL_INSERT= 
			"INSERT INTO member (account, passwd, email) VALUES (?, ?, ?)" ;
			
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Account : ");
		String account = scanner.next();
		
		System.out.print("Password : ");
		String passwd = scanner.next();
		
		System.out.print("Email : ");
		String email = scanner.next();
		
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
				
		try {
			conn = DriverManager.getConnection(URL, prop);
			// 確認帳號是否存在
			if (checkAccout(account)) {
				// 檢查增加會員資料是否成功
				if (addMember(account, passwd, email)) {
					// OK
					System.out.println("Register success");
				} else {
					// XX2
					System.out.println("Register failure");
				}
			} else {
				// XX1
				System.out.println("Account exist");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	// 確認帳號
	static boolean checkAccout(String account) throws Exception {
		boolean ret;
		
		// 下sql指令看帳號是否重複存在
		PreparedStatement pstmt = conn.prepareStatement(SQL_CHECK);
		pstmt.setString(1, account);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		ret = rs.getInt("count") == 0;
		rs.close();
		rs = null;
		
		return ret;
	}
	
	// 增加會員資料
	static boolean addMember(String account,String passwd, String email )throws Exception{
		boolean isOK;
		// 下sql指令增加資料
		PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
		pstmt.setString(1, account);
		// 密碼部分做加密動作
		pstmt.setString(2, BCrypt.hashpw(passwd, BCrypt.gensalt()));
		pstmt.setString(3, email);
		isOK = pstmt.executeUpdate() != 0;
		
		return isOK;
	}

}