package tw.org.iii.myclasses;

import java.io.Serializable;

// 這邊以腳踏車工程師的思考方式,給腳踏車基本功能
public class Bike extends Object implements Serializable{
	// 對外宣稱這個類別是Bike, 預設Object為父類別
	protected double speed;
	// 要把public改成private, 不然速度就可以隨便設值; private改成protected, (保護機制)適度開放
	// 使用double就是完成初始化
	// 屬性全小寫
	// Bike 擁有speed(速度)這個屬性
	
	private String color;
	// 建構式:不需要返回值(return跟viod)，初始化在大括號內
	public Bike() { 
//		System.out.println("Bike()");
		color = "yellow";
	}
	
	public String getColor() { 
		return color;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed *1.2;
		// (條件) ? (成立時的值) : (不成立時的值)
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed *0.7;		
	}
	
	public double getSpeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "Bike" + speed;
	}
}
