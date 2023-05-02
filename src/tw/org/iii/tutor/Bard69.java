package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Bard69 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com.tw");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			// 建立一個HttpsURLConnection物件，用來進行HTTP請求
			conn.connect();
			// 用Bard65的21行到28行
//			InputStream in = conn.getInputStream();
//			InputStreamReader ir = new InputStreamReader(in);
//			BufferedReader br = new BufferedReader(ir);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			// 逐行讀取網頁內容，並輸出到控制台
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			conn.getInputStream();
			
			System.out.println("OK");				
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
