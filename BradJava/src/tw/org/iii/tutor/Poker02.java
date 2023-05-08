package tw.org.iii.tutor;

import java.util.Arrays;

public class Poker02 {

	public static void main(String[] args) {
		int[] poker = shuffle();
		
		// 發牌
		int[][] players = new int[4][13];
		for (int i = 0;i < poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		String[] suits = {"黑桃","紅心","方塊","梅花"};		
		// 陣列{0,1,2,3}表示除以13的商
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// 陣列{0,1,2,3,4,5,6,7,8,9,10,11,12}表示除以13的餘數
		
		for (int[] player: players) {
			Arrays.sort(player);
			// 裡牌
			int[] cards = pairSort(player);
			for (int card: cards) {
				System.out.print(suits[card/13] + values[card%13] + " ");
//				System.out.print("%s%s", suits[card/13], values[card%13]);
			}
			// %d :值, %s :字串, %f :浮點數
			System.out.println();
		}
		
		
	}

	static int[] shuffle() {
		// 1.洗牌
		int count = 52;
		int[] poker = new int[count];
		for (int i = 0; i < poker.length; i++) {
			boolean isRepeat;
			int temp;
			do {
				temp = (int) (Math.random() * count);

				// 檢查機制
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						// 重複
						isRepeat = true;
						break;
					}
				}

			} while (isRepeat);
			poker[i] = temp;
//			System.out.println(poker[i]);
		}
//		System.out.println("---");
		return poker;
	}
	
	static int[] pairSort(int[] mycards) {
		int[] temp = new int[mycards.length];
		int counter = 0;
		for (int i=0; i<13; i++) {
			for (int j=0; j<mycards.length; j++) {
				if (mycards[j] % 13 == i) {
					temp[counter++] = mycards[j];
				}
			}
		}
		
		return temp;
	}
	
	
}
