package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Bard58 {

	public static void main(String[] args) {
		// 讀資料
		try {
			FileInputStream fin = new FileInputStream("dir1/fstdata.csv");	
			// 用來從檔案中讀取資料
			InputStreamReader ir = new InputStreamReader(fin);
			// 將讀取的資料編碼成 Unicode 字元。
			BufferedReader br = new BufferedReader(ir);
			// 讀取文字資料，並進行資料緩衝，讓讀取效率更好。
			
			String line;
			while ((line = br.readLine()) != null) {
			// 逐行讀取資料，直到結尾為止，讀到的每一行資料儲存在 String 變數 line 中
				String[] row = line.split(",");
				System.out.println(row[1] + ":" + row[5] + ":" + row[7]);
				// (陣列第1個資料+陣列第5個資料+陣列第7個資料)
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
