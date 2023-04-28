package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bard61 {

	public static void main(String[] args) {
		Bard613 obj = new Bard613();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/Brad"));
			oout.writeObject(obj);	
			oout.flush();
			oout.close();
			
			System.out.println("----");
			
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/Brad"));
			oin.readObject();	
			oin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

class Bard611 {
	Bard611(){System.out.println("Bard611()");}
}

class Bard612 extends Bard611 {
	Bard612(){System.out.println("Bard612()");}
}

class Bard613 extends Bard612 implements Serializable{
	// implements Serializable:可序列化, 在做物件輸出儲存後可以在輸出還原物件
	// 這邊加implements Serializable後Bard613做序列化, 他的祖宗八代做初始化被印出
	Bard613(){System.out.println("Bard613()");}
}