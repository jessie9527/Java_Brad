package tw.org.iii.tutor;

public class Dice2 {

	public static void main(String[] args) {
		int[] p = new int[7];
		for (int i = 0;i < 100; i++) {
			int point = (int)(Math.random()*9 + 1);
			if (point > 0 && point <= 9) {
				p[point >= 7? point-3 : point]++;
			} else {
				p[0]++;
			}
		}
		if(p[0] == 0) {
			for (int i = 1;i < 7; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);				
			}
		}else {
			System.out.printf("Debug =" + p[0]);
		}
		System.out.println("----");
		
		for (int v : p) {
			System.out.println(v);
		}
		// for-each用法:尋訪，把每個元素都跑一遍
	}

}
