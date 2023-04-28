package tw.org.iii.tutor;

public class Bard28 {

	public static void main(String[] args) {
		Bard281 obj1 = new Bard281(2);
		Bard282 obj2 = new Bard282();
		Bard283 obj3 = new Bard283();
		
	}

}

// 所有類別都有建構式
class Bard281 extends Object {
	// 類別要一定要把父物件叫近來(extends Object)
	
	// 我有定義建構式,有加參數後上面呼叫新物件也要加整數
	Bard281(int a){
		// 這邊沒寫東西,會直接幫我們加 super();
		System.out.println("Bard281(int)");
	}
}

class Bard282 extends Bard281 {
// 因為父物件有定義建構式,所以這邊也需要	
	
	Bard282(){
		super(3);
		// 因為父物件系統有加super();子物件要加
		System.out.println("Bard282()");
	}
}

class Bard283 extends Bard282 {
	
	Bard283(){
		// 這邊不能有super(),因為Bard282沒有參數,因為單一繼承
		
		System.out.println("Bard283()");
		// 這邊印出來會看到Bard281(int)、Bard282()、Bard283()
		// 所以跑這邊會先去找父物件,父物件還會往上找,
		// 所有物件要初始化,祖宗八代到Object開始跑一遍

	}
}