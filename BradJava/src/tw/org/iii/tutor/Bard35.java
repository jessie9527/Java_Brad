package tw.org.iii.tutor;

import java.util.HashSet;

public class Bard35 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(1054);
		set.add(123);
		set.add("Brad");
		set.add(123);		
		System.out.println(set.size());
		// 增加的數量一樣會被歸一起
		System.out.println(set.toString());
		
	}

}
