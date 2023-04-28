package tw.org.iii.tutor;

public class Bard18 {

	public static void main(String[] args) {
		int a = 20;
		do {
			System.out.println(a--);
		}while (a > 0);
		System.out.println("----");
		while (a < 10) {
			System.out.println(a++);
		}
		System.out.println("----");
		a = 0;
		
		for (;a < 10;) {
			System.out.println(a++);
		}
	}

}
