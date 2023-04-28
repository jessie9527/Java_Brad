package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class Bard36 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("III");
		set.add("Bard");
		set.add("Eric");
		set.add("Peter");
		set.add("Tony");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
			// 沒有順序性
		}
		System.out.println("----");
		for (String v : set) {
			System.out.println(v);
		}
		// java在實作都有可迭代
	}
	

}
