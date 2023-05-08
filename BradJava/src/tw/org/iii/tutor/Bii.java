package tw.org.iii.tutor;

public class Bii {
	
	public static void main(String[] args) {
		// 產生cat物件, 類別是Apple
		Apple cat = new Apple();
		// 印出Apple物件的屬性b
		System.out.println(Apple.a);
//		System.out.println(cat.a);
		
		// 印出物件貓的屬性b
		System.out.println(cat.b);
		
		// 
		Apple dog = new Apple();
		dog.a = "雷丘";
		System.out.println("我是分隔線aa");
		System.out.println(cat.a);
        System.out.println(dog.a); 

		System.out.println("我是分隔線bb");
		dog.b = "傑尼烏龜";
		System.out.println(cat.b);
        System.out.println(dog.b); 
		
	}
}
