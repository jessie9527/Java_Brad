package tw.org.iii.tutor;

public class Bard14 {

	public static void main(String[] args) {
		int a;
		int[] b;
		a = 1;
		b = new int[3];		
		// int[3]是在記憶體有3個位子, b new完後把int[3]放在b下面
		
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		b[0] = 123;
		b[1] = -55;
		System.out.println("---");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("---");
		System.out.println(a);
		System.out.println(b);
		System.out.println(b[0]);
	}

}
