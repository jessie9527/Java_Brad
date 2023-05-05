package tw.org.iii.tutor;

import tw.org.iii.myclasses.TWId;

public class Bard23 {

	public static void main(String[] args) {
		String id = "A12456789";
		// 使用正規表示法:常用在設定密碼時
		if (TWId.checkId(id)) {	// [0-9]{8}:[0-9]重複出現8次
			System.out.println("OK");
		} else {
			System.out.println("XX");			
		}
		TWId t1 = new TWId();
		System.out.println(t1.checkId1(id));
		System.out.println("----");
		
		TWId id1 = new TWId();
//		TWId id2 = new TWId(1);
		TWId id3 = new TWId(false);
		TWId id4 = new TWId(true, 0);
		
		System.out.println(id1.getId());
//		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWId id5 = TWId.createTWId("A123456789");
		System.out.println(id5.getId());
		
	}
	
	
}
