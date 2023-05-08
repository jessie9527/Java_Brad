package tw.org.iii.tutor;

public class Bard26 {

	public static void main(String[] args) {
		byte b1 = 123;
		int i1 = b1;
		int i2 =128;
		byte b2 = (byte)i2;
		System.out.println(b2);
		System.out.println("---");
		byte b3 =127;
		b3++;		// 位元、位移運算
		b3 += 1;	// 指派運算
		System.out.println(b3);
	}

}
