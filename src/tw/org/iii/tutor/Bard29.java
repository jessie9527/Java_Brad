package tw.org.iii.tutor;

public class Bard29 {
	public static void main(String[] args) {
		 Bard292 obj1 = new  Bard292();
		 Bard291 obj2 = new  Bard292();
		 // 我要一台車,但是用法拉力來建構新物件
		 obj2.m1();
		 // 實際執行是物件實體的, 例如:現在踩油門(m1)會跑很快
		 Bard291 obj3 = new  Bard293();
		 doThing(obj3);
		 // 雖然是叫Bard291的m1,但是他繼承Bard291有自己的m1,所以我們出來是自己繼承後的Bard293:m1()
		 
	}
	
	static void doThing(Bard291 obj) {
		obj.m1();
	}
}

class Bard291 { void m1() {System.out.println("Bard291:m1()");}}

class Bard292 extends  Bard291 { 
	void m1() {System.out.println("Bard292:m1()");}
	void m2() {System.out.println("Bard292:m2()");}
	
}

class Bard293 extends  Bard291 { 
	void m1() {System.out.println("Bard293:m1()");}
	void m2() {System.out.println("Bard293:m2()");}
	
}
