package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;
// 傳送端
public class Bard67 {

	public static void main(String[] args) {
		try {
			File source = new File("dir1/iconmonstr-soccer-1-64.png");
			BufferedInputStream bin = 
				new BufferedInputStream(
					new FileInputStream(source));
			byte[] buf = new byte[(int)source.length()];
			bin.read(buf);
			bin.close();
			System.out.println("read ok");
			
			Socket socket = new Socket(
					InetAddress.getByName("10.0.104.65"), 9999);
			BufferedOutputStream bout = 
				new BufferedOutputStream(socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			socket.close();
			System.out.println("send OK");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
