package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.FieldPosition;

public class Bard55 {

	public static void main(String[] args) {
		
		try {
			long start = System.currentTimeMillis();	// 測量代碼執行時間
			FileOutputStream fout = new FileOutputStream("dir2/brad.jpg");
			// 複製dir1的照片到dir2照片名稱為:brad.jpg
			FileInputStream fin = new FileInputStream("dir1/pariwat-pannium-WLk7wdUpKXc-unsplash.jpg");
			// 輸出的照片
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish" + (System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
