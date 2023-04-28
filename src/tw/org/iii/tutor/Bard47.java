package tw.org.iii.tutor;

import java.io.File;

public class Bard47 {

	public static void main(String[] args) {
		File root = new File(".");		//.代表本路徑, ..代表上一層路徑
		System.out.println(root.getAbsolutePath());
		File dir1 = new File("dir2");	// "dir2" = "./dir2"
		if (dir1.exists()) {
			System.out.println("OK");
		} else {
			System.out.println("XX");			
		}
	}

}
