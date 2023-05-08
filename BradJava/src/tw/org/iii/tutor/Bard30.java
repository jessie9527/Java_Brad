package tw.org.iii.tutor;

public class Bard30 {

	public static void main(String[] args) {
//		Brad301 obj1 = new Brad301();
		Brad301 obj2 = new Brad302();
		Brad301 obj3 = new Brad303();
		obj2.m2();
		obj3.m2();
	}

}

// 誇號裡面有抽象方法一定要是抽象類別, 沒有抽象方法也是可以是抽象類別
abstract class Brad301{
// 大誇號裡面有抽象方法，那就要定義自己是抽象類別
	Brad301(int a){
		System.out.println("Brad301()");
	}
	void m1() {System.out.println("Brad301:m1()");	}
	abstract void m2();
	// abstract:抽象; m2是一個抽象方法
}

class Brad302 extends Brad301{
// Brad302繼承Brad301, Brad301裡面有一個抽象方法m2, 要把這方法實作才不需要定義抽象類別
	Brad302(){
		super(2);
		System.out.println("Bard302()");
	}
	void m2() {System.out.println("Brad302:m2()");}
}

class Brad303 extends Brad301{	
// Brad303繼承Brad301, Brad301裡面有一個抽象方法m2, 要把這方法實作才不需要定義抽象類別
	Brad303() {
		super(2);
		System.out.println("Bard303()");
	}
	void m2() {System.out.println("Brad303:m2()");}
}