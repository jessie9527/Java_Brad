package tw.org.iii.tutor;

import tw.org.iii.myclasses.BCrypt;

public class Bard75 {
	// 加密
	public static void main(String[] args) {
		String passwd = "123456";
		// 使用了 BCrypt 類別的 hashpw 方法來將一個原始密碼加密成一個雜湊值，並使用 gensalt 方法生成一個隨機的 salt 值。
		String hwPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		// 再把加密的密碼印出
		System.out.println(hwPasswd);
		
		if (BCrypt.checkpw("123456", hwPasswd)){
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
