package tw.org.iii.tutor;

public class Bard07 {

	public static void main(String[] args) {
//		double temp = Math.random();
//		System.out.println(temp);
//		double temp2 = temp * 101; 
//		int score = (int) temp2;	//把temp2強制轉型為整數
//		System.out.println(score);

		int score = (int) (Math.random() * 101);
		// Math.random()的範圍是0~1.0(不包含1), 0~100有101個數, 所以要*101
		System.out.println(score);
		if (score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Down");
		}

		int dice = (int) (Math.random() * 6 + 1); 
		// 骰子有6個數且從1開始,所以*6後是(0~6)要再加1(1~7)
		System.out.println(dice);
		if (dice >= 4) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}
	}

}
