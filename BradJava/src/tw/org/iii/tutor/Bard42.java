package tw.org.iii.tutor;

public class Bard42 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] e = { 1, 2, 3, 4 };
		try {
			System.out.println(a / b);
			System.out.println(e[3]);
		} catch (ArrayIndexOutOfBoundsException aiooe) {
			System.out.println("not much!");
		} catch (ArithmeticException ae) {
			System.out.println("error!");	
		} catch (RuntimeException re) {
			// 全部統一處理
			System.out.println("not much!");
		}
		System.out.println("OK!");

		System.out.println("------");
		double c = 10, d = 0;
		// double都可以計算
		System.out.println(c / d);
		// 可以計算, 印出無限大
	}

}
