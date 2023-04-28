package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

// 這邊以使用者的想法思考, 如何以腳踏車功能去玩腳踏車
public class Bardbike {

	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.getSpeed());
		
		while (bike.getSpeed() <= 7) {
		    bike.upSpeed();
		}
//		 bike.upSpeed(); bike.upSpeed(); bike.downSpeed();
		System.out.println(bike.getSpeed());
		System.out.println(bike.getColor());
		
	}

}
