package tw.org.iii.tutor;

public class Bard04 {

	public static void main(String[] args) {
		// 浮點 :float, double
		// float 2^32; double 2^64 :數字越大精確度越大
		float var1 = 123;
		float var2 = 12.3f;		// 12.3 被視為double, 所以要加上f視為float 
		double var3 = 123;
		double var4 = 12.3;	
		double var5 = 10 / 3.0;	// 3後面加.0才會出現小數，沒有加是整數
		System.out.println(var5);
		float var6 = 10 / 3.0f;
		System.out.println(var6);
		
	}

}
