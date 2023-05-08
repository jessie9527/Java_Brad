package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bard50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
//			int c = fin.read();
//			System.out.println((char)c);
			
			// 讀取檔案資料內容
			int c ;
			while ((c = fin.read())!= -1) {
				System.out.print((char)c);				
			}
			
//			int text;
//            for (int i = 0; (text = fin.read()) != -1; i++) {
//                System.out.print((char) text);
//            }
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
