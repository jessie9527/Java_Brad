package tw.org.iii.tutor;

public class Bard43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		// 下面類別有限制, 所以要去捕捉是否會有例外
		try {
			b1.setLeg(2);			
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println("Error");
		}
	}
}

class Bird {
	private int leg;
	void setLeg(int leg) throws Exception{
	// 宣告這段可能會拋出例外
		if (leg >= 0 && leg <= 2) {
			this.leg = leg;			
		}else {
			throw new Exception();
		}
	}
}
