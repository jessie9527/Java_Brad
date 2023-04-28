package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		String strX = JOptionPane.showInputDialog("X = ?");
		String strY = JOptionPane.showInputDialog("Y = ?");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		int r = x + y;
		
		JOptionPane.showInputDialog(null, String.format("%d + %d = %d", x, y, r));	
		// 有static不用宣告

	}

}
