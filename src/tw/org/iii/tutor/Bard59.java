package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.myclasses.Student;

public class Bard59 {

	// 物件序列化
	public static void main(String[] args) {
		Student s1 = new Student("Brad", 91, 54, 68);
		System.out.println(s1.sum() + ":" + s1.avg());
		Student s2 = new Student("Andy", 78, 85, 77);
		System.out.println(s2.sum() + ":" + s2.avg());
		try {
			FileOutputStream fout = new FileOutputStream("dir1/s1");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
