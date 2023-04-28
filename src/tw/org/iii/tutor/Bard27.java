package tw.org.iii.tutor;

public class Bard27 {

	public static void main(String[] args) {
		m1(1, 2);			// (int, int):叫第三個
		m1(1, (byte)2);		// (int, Byte):叫第四個(第四個不存在時會叫比較類似的第三個)
		
	}
	static void m1(byte b1, byte b2) {
		System.out.println("m1(byte b1, byte b2)");
	}
	static void m1(byte b1, int b2) {
		System.out.println("m1(byte b1, int b2)");
	}
	static void m1(int b1, int b2) {
		System.out.println("m1(int b1, int b2)");
	}
	static void m1(int b1, byte b2) {
		System.out.println("m1(int b1, byte b2)");
	}
}
