package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Bard24 {

	public static void main(String[] args) {
		String s1 = "Brad";					// 做新的指向,原來保持不變,所以要另外給其他變數去改變
		String s2 = s1.concat("Chao");		// concat:在變數後面加字
		String s3 = s1.replace('a', 'A');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("---");
		
		int a = 10, b = 3;
		System.out.println(a == b);
		String str1 = "Brad";
		String str2 = "Brad";
		System.out.println(str1 == str2);		// 傳值, 值是一樣的, 所以是true
		String str3 = new String("Brad");		// 做新的物件
		String str4 = new String("Brad");		
		System.out.println(str3 == str4);		// 傳址:這邊是比較,因為記憶體位置所以false
		System.out.println(str1 == str3);

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1);
	}

}
