package tw.org.iii.tutor;

public class A123 {

	static int a = 100;
	int b = 100;

	static class Coffee extends Thread {

		@Override
		public void run() {
			while(true) {
				System.out.println("Hello");
				try {

					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
//		System.out.println("Ready");
//		
//		Coffee cof = new Coffee();
//
//		cof.run();
////		cof.start();
//		
//		System.out.println("Finish");
		
		A123.a -= 1;		
		
		A123 a1 = new A123();
		System.out.println(A123.a);
		System.out.println(a1.b -= 10);

		A123 a2 = new A123();
		System.out.println(A123.a);
		System.out.println(a2.b);
	}

}
