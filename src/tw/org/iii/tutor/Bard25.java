package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Bard25 {

	public static void main(String[] args) {
		String str1 = "Brad";
		String str2 = "Brad";
		System.out.println(str1.equals(str2));	// 有改寫物件
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.equals(b2));		// 沒改寫就是在比兩個物件是否一樣
		System.out.println(b2 == b1);
		Bike b3 = b2;							// b3等於b2物件記憶體位置
		System.out.println(b2.equals(b3));
		System.out.println(b2 == b3);
		
	}

}
