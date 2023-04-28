package tw.org.iii.tutor;

public class Poker01 {

	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
		// 1.洗牌
		int count = 52;
		int[] poker = new int[count];
		for (int i = 0; i < poker.length; i++) {
			int temp = (int)(Math.random()*count);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j = 0;j < i; j++) {
				if (temp == poker[j]) {
					// 重複
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] =temp;
			}else {
				i--;
			}
		}
		for (int v: poker)
			System.out.println(v);
	}
	
}
