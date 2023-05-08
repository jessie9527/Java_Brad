package tw.org.iii.tutor;

import java.io.File;

public class Bard46 {

	public static void main(String[] args) {
		File file1 = new File("D:/dir1");
		if (file1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");			
		}
	}

}
