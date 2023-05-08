package tw.org.iii.tutor;

public class Bard72 {

	public static void main(String[] args) {
		Bard721 obj1 = new Bard721("A");
		Bard721 obj2 = new Bard721("B");
		// 我用722做一個物件實體是obj3
		Bard722 obj3 = new Bard722("C");
		// 這邊要做執行緒的特徵
		Thread t1 = new Thread(obj3);
		
		obj1.start(); obj2.start();t1.start();
		// 用執行緒只能表現一次
//		obj1.run(); obj2.run();
		System.out.println("main");
	}

}

class Bard721 extends Thread{
	String name;
	Bard721(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0;i < 10;i++) {
			System.out.println(name + "." +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Bard722 implements Runnable{
	String name;
	Bard722(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0;i < 10;i++) {
			System.out.println(name + "." +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}


