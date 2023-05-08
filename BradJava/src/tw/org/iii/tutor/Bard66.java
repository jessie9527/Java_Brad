package tw.org.iii.tutor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Bard66 {
	// TCP, 傳送(常用)
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.104.241"), 9957);
			OutputStream oout = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("Hello, TCP");
			bw.flush();
			bw.close();
			
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
