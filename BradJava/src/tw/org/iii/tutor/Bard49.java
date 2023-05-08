package tw.org.iii.tutor;

import java.io.File;

public class Bard49 {

	public static void main(String[] args) {
		File dir1 = new File("dir1");
		if (dir1.exists() && dir1.isDirectory()) {
			File[] files = dir1.listFiles();
			for (File file:files) {
				String fname = file.getName();	// 檔案名稱
				long size = file.length();		// 檔案大小
				String type = file.isDirectory()?"dir":"file";
				System.out.println(fname+":"+size+":"+type);
//				System.out.println(file.getName());
				// 尋訪後找dir1下檔案名稱
			}
		}
	}

}
