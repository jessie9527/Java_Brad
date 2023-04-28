package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bard51 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			
			// 讀取檔案資料內容的中文字(使用2^24)
			byte[] buf = new byte[3] ;
			int len;
			while ((len = fin.read(buf))!= -1) {
				System.out.print(new String(buf, 0, len));				
			}
			
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
