package tw.org.iii.tutor;

public class Multiptable99 {

	public static void main(String[] args) {
		
		// 用final給定參數後讓下面的範圍用參數表示,改變形式改變參數的值即可
		final int ROWS = 5;		// final後面只能給值一次
		final int START = 1;
		final int COLS = 3;
		
		for (int k = 0; k < ROWS; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = START; i < (START+COLS); i++) {
					int newi = i + k * COLS;		// 產生新的i讓它是原本的i家k乘列數
					int r = newi * j;
					System.out.printf("%d X %d = %d \t", newi, j, r);	// "\t"是tab鍵
				}
				System.out.println();
			}
			System.out.println("----");
		}

	}

}
