package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.myclasses.Student;

public class Bard60 {

	public static void main(String[] args) {
		try {
			// 1. 宣告並初始化 ObjectInputStream 物件 oin，並傳入檔案路徑
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/s1"));
			
			// 2. 呼叫 oin 的 readObject() 方法解序列化，將讀取的物件資料存在 obj 中
			Object obj = oin.readObject();	// 解序列化
			
			// 3. 判斷 obj 是否為 Student 物件，若是則進行強制轉型
			if (obj instanceof Student) {
				Student s1 = (Student)obj;
				System.out.println(s1.sum() + ":" + s1.avg() );
			}else {
				System.out.println("Not");
			}
			
			// 4. 重複步驟 2~3，讀取第二個 Student 物件
			Object obj2 = oin.readObject();
			if (obj2 instanceof Student) {
				Student s2 = (Student)obj2;
				System.out.println(s2.sum() + ":" + s2.avg() );
			}else {
				System.out.println("Not");
			}
			
			// 5. 關閉物件串流
			oin.close();
		} catch (Exception e) {
			// 若出現例外，直接印出錯誤訊息
			System.out.println(e);
		}
	}

}
