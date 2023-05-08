package tw.org.iii.tutor;

import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Bard44 {

	public static void main(String[] args) {
		try {
			new Brad441().m1();
		}catch (Exception e) {
			
		}
	}

}

class Brad441 {
	void m1() throws Exception{
		m2();
	}
	void m2() throws Exception{
		m3(3);
	}
	void m3(int a) throws FontFormatException, IOException{
		// 不處理, 就往上拋
		if (a > 0) {
			throw new FontFormatException(null);			
		} else {
			throw new FileNotFoundException();						
		}
	}	
	
//	void m3() throws FontFormatException{
//		throw new Exception(null);
//	}	
	// 錯誤:不會拋出比父類別更大的例外, 只能放子類別的例外
}

class Brad442 extends Brad441 {
	void m3(int b) throws IOException{
		
	}
}


