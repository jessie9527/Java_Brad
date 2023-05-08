package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Bard65 {
	// TCP:接收(常用)
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9957);
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostAddress();
			// getHostAddress():別名
			System.out.println(urip);
			
			InputStream in = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(ir);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
			server.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
