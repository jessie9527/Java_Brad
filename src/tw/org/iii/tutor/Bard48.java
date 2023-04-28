package tw.org.iii.tutor;

import java.io.File;
import java.io.IOException;

public class Bard48 {

	public static void main(String[] args) {
		File dir11 = new File("dir1/dir11");
		if (!dir11.exists()) {
			dir11.mkdir();
			// 建立dir1裡的一個資料夾, 如果資料夾已存在則不會建立
		}
		System.out.println("-------");
		File dir2345 = new File("dir2/dir3/dir4/dir5");
		dir2345.mkdirs();	// mkdirs()常用, 直接建立dir2下的dir3下的dir4下的dir
		System.out.println("-------");
		File f1 = new File("dir1/file1.txt");
		try {
			f1.createNewFile();		//建立文檔
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
