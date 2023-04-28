package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Bard63 {
	// UDP:發送
	public static void main(String[] args) {
		byte[] data = "早安".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					data, data.length, InetAddress.getByName("10.0.104.255"), 8888);
					// ( , ,10.0.104.255:全部都會收到 ,port號)
			socket.send(packet);
			socket.close();
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
