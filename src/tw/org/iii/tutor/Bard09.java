package tw.org.iii.tutor;

public class Bard09 {

	public static void main(String[] args) {
		int year = 2023;
		boolean isLeap;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					//閏
					isLeap = true;
				} else {
					//平
					isLeap = false;
				}
			} else {
				//閏
				isLeap = true;
			}
		} else {
			//平
			isLeap = false;
		}
		System.out.printf("%d年為%s年", year, (isLeap?"閏":"平"));
	}

}
