package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
// 接收端
public class Bard68 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[1024*1024];
			int len;
			
			String hostname = socket.getInetAddress().getHostAddress();
			BufferedOutputStream bout = 
					new BufferedOutputStream(
							new FileOutputStream(String.format("dir2/ball1.png", hostname)));
			
			while ((len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}

			bin.close();
			socket.close();
			server.close();
			System.out.println("Receive OK:" + hostname);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
