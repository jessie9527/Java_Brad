package tw.org.iii.tutor;

public class Bard33 {

	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		// Integer(), 這個未來可能不能用
		Integer c = new Integer("10");
		Integer d = Integer.parseInt("10");	
		// 等於c那行, 直接是一個物件
		Integer e = 10;		
		// auto-boxing(自動封箱), 等於b那行, 直接是一個物件
		System.out.println(e.doubleValue());
		
		System.out.println(b + c);
		// b, c => auto-unboxing(自動解箱), 整數物件可以直接相加, 一般物件不能
	}

}
