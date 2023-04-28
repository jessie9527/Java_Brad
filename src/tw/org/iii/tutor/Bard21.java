package tw.org.iii.tutor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bard21 extends JFrame{
	private JButton b1;
	
	// public 方法 {呼叫},建構式:{}
	public Bard21() {
		setTitle("我的視窗");
		
		setLayout(new FlowLayout());
		// 上下兩個的new是一樣的意思, 要把外部的東西(不在JFrane裡面)抓出來
		b1 = new JButton("按我");
		add(b1);	// 丟到畫面
		
		setSize(640,480);		// 設置視窗大小(window那一層就有)
		setVisible(true);		// 讓視窗出現
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 設定視窗案叉叉後被關閉
	}

	public static void main(String[] args) {
		new Bard21();
		
	}

}
