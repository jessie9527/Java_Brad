package tw.org.iii.tutor;

public class Bard05 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 65;	// 2^16 => 0~65535, 字元做ASCII轉換
		System.out.println(c1);
		System.out.println(c2);
		int var1 = c1 + c2;
		System.out.println(var1);
		char c3 = '資';
		int var2 = c3;
		System.out.println(var2);
	}

}
