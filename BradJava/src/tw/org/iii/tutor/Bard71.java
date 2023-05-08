package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Bard71 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.iii.org.tw/assets/images/information-news/image005.jpg?fbclid=IwAR0J4qAwmoWw7URR0NsY8JZQSdaQaUfxky6LHVDTesybXh8cAYxlM5ZG3xs");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();

			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			FileOutputStream fout = new FileOutputStream("dir2/iii.jpg");
			byte[] buf = new byte[4*1024];
			int len;
			while ((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			bin.close();
			
			System.out.println("OK");				
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
