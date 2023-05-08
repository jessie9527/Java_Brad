package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Bard57 {
	// 55、56、57:都一樣, 只是55要花很久
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("dir1/file1.txt");
		File target = new File("dir2/file1.txt");
		try {
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read();
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(target);
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("finish3:" + (System.currentTimeMillis()- start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
