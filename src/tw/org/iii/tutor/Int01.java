package tw.org.iii.tutor;

public class Int01 {

	public static void main(String[] args) {   
		// byte, short, int, long : 整數
		// byte 2^8 => -128 ~ 127 : byte的範圍
		// short 2^16 = 65536 => -32768 ~32767 : short的範圍
		// int 2^32 = 4294967296 =>
		byte var1;
		byte var2, vart3;
		byte var4 = 123;

		System.out.println(var4); // 打sysout 按 alt + / :快捷鍵 -> 再按 tab+空白+enter

		int var5 = var4 + 1; // var4 + 1 :相加完後是int型式, 太大放不進去byte
		short var6 = 321, var7 = 123;
		int var8 = var6 + var7; // var6 + var7 :相加完是int, 太大放不進去short
		// ----------------------------------------------------------------
		// [a-z A-Z $_][a-z A-Z 0-9 $_]*
		byte $$$ = 101;
		System.out.println($$$);
		int 變數1 = 123;
		System.out.println(變數1);

	}

}
