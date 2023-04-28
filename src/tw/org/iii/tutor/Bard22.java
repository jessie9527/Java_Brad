package tw.org.iii.tutor;

public class Bard22 {

	public static void main(String[] args) {
		// 建構
		String s1 = "Brad";
		// 只要雙引號一出現就是物件, 所以不需要new
		System.out.println(s1);
		System.out.println("Brad".charAt(0));
		String s2 = new String();
		byte[] b1 = {65,66,67,68};
		String s3 = new String(b1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
