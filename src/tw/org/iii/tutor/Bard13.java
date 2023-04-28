package tw.org.iii.tutor;

public class Bard13 {

	public static void main(String[] args) {
//		for (int i = 0;i < 10;i++) {
//			// i=0先到第二道敘述句判斷是否正確,正確被印出來
//			// 再回到迴圈for()內去第三道敘述句i++(做+1的動作)到第二道敘述句判斷是否正確,正確被印出來
//			System.out.println(i);
//		}
		
		int i = 0;
		for (printBrad() ; i < 10; printLine()) {
			System.out.println(i++);
		}
	}
	static void printBrad() {
		int lottery = (int)(Math.random()*49 + 1);
		System.out.println("Brad" + lottery);
	}
	
	static void printLine() {
		System.out.println("----");
	}


}
