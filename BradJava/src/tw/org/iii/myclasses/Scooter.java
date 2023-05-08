package tw.org.iii.myclasses;

public class Scooter extends Bike{
// 對外宣稱Scooter繼承Bike ;摩托車是腳踏車子類別 ;腳踏車是摩托車父類別
	private int gear;
	// 摩托車擁有檔位
	
	@Override // 覆寫:改功能
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * gear *1.2;
	}
	
	// 增加新功能
	public int changeGear(int newgear) {
		if (newgear >= 0 && newgear <= 4) {
			gear = newgear;
		}
		return gear;
	}
}
