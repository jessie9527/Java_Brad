package tw.org.iii.tutor;

public class Practice {

	public static void main(String[] args) {
		System.out.println("A");
		First fir = new Practice().new First();
		fir.start();
		System.out.println("B");
		Second sec = new Practice().new Second();
		sec.start();
		System.out.println("C");
	}

	class First extends Thread {
		
		public void run() {
			while (true) {
				// TO DO
			}
		}
	}

	class Second extends Thread {
		public void run() {
			while (true) {
				// TO DO
			}
		}
	}
}