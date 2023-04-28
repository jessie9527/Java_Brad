package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bard52 {

	public static void main(String[] args) {
		try {
			File sourse = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(sourse);
			
			// 讀取檔案資料內容的中文字(使用2^24)
			byte[] buf = new byte[(int)sourse.length()] ;	
			// 裡面無法放到long, 所以要強制轉型
			fin.read(buf);
			System.out.print(new String(buf));				
			
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
