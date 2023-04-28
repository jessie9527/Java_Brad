package tw.org.iii.tutor;

public class Bard34 {

	public static void main(String[] args) {
		
	}
}

interface Bard341 {
	void m1();
}

interface Bard342 {
	void m2();
}

interface Bard343 extends Bard341, Bard342 {
// 可以有多個副介面, 跟類別不一樣, 類別只能繼承一個物件
	void m3();
}

class Bard344 implements Bard343 {
// 類別需要實作
	public void m1() {}
	public void m3() {}
	public void m2() {}	
}
