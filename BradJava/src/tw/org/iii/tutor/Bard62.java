package tw.org.iii.tutor;

import java.net.InetAddress;

public class Bard62 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com"); 
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
