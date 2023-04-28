package tw.org.iii.myclasses;

public class TWId {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	//	TWId擁有string的屬性, 加上static後只跟類別有關, 跟物件沒關係
	//	static可以呼叫外部的static
	
	public TWId() {
		// 第一道敘述句只能有super或this
		// this(true); 呼叫布林值(其他行)
		
		this((int)(Math.random()*2) == 0);		
		// 推給(boolean isMale)
	}
	
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));	
		// 推給(boolean isMale, int area), 這邊是boolean所以前者不變
	}
	
	public TWId(int area) {
		this((int)(Math.random()*2) == 0, area);	
		// 推給(boolean isMale, int area), 這邊是area所以後者不變
	}
	
	public TWId(boolean isMale, int area) {
		String c1 = letters.substring(area, area+1);
		StringBuilder sb = new StringBuilder(c1);
		sb.append(isMale?"1":"2");
		for (int i=0 ; i<7 ; i++) {
			sb.append((int)(Math.random()*10));
		}
		String temp = sb.toString();
		for (int i=0; i<10 ;i++) {
			if (checkId(temp + i)) {	// 物件可以呼叫static, static只可呼叫外部的static
				id = temp + i;
				break;
			}
		}
	}
	
	private TWId(String id) {
		this.id = id;		// this的本類別id等於這邊參數傳進來的id
	}
	
	public static TWId createTWId(String id) {
		TWId twId = null;			
		if (checkId(id)) {
			twId = new TWId(id);
		}
		return twId;
	}
	
	public String getId() {
		return id;
	}
	
	// static放哪都可以跟物件沒有關係 
	
	public static boolean checkId(String id) {
		boolean isRight = false;
		if (id.matches("[A-Z][1289][0-9]{8}")) {
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			// indexOf:陣列索引值(位置)
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2)) ;
			int n4 = Integer.parseInt(id.substring(2, 3)) ;
			int n5 = Integer.parseInt(id.substring(3, 4)) ;
			int n6 = Integer.parseInt(id.substring(4, 5)) ;
			int n7 = Integer.parseInt(id.substring(5, 6)) ;
			int n8 = Integer.parseInt(id.substring(6, 7)) ;
			int n9 = Integer.parseInt(id.substring(7, 8)) ;
			int n10 = Integer.parseInt(id.substring(8, 9)) ;
			int n11 = Integer.parseInt(id.substring(9, 10)) ;
			
			int sum = n1*1 + n2*9 + n3*8 + n4*7 +n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			isRight = sum%10 == 0;
		}
		return isRight;
	}
	
	public static boolean checkId1(String id) {
		if (id.length() != 10) {
			return false;
		}
		char c01 = id.charAt(0);
		if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c01) == -1) {
			return false;
		}
		if (id.charAt(1) == '1' || id.charAt(1) == '2') {
		
		} else {
			return false;						
		}
		for (int i = 2; i < 10;i++) {
			int c = id.charAt(i);
            if (c < '0' && c > '9') {
            	return false;
            }
		}
		
		return true;
		
//		boolean isRight = false;
//		if (id.length() == 10) {
//			char c1 = id.charAt(0);
//			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c1) != -1) {
//				if (id.charAt(1) == '1' || id.charAt(1) == '2') {
//					for (int i = 2; i < 10;i++) {
//						int c = id.charAt(i);
//	                    if (c >= '0' && c <= '9') {
//	                        isRight = true;
//	                    } else {
//	                        isRight = false;
//	                        break;
//	                    }
//					}
//				}
//			}
//		}
//		return isRight;
	}
	
}
