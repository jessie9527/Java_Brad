package tw.org.iii.tutor;

import java.util.Scanner;  // 除了java.lang不需要import, 其他都需要, 這邊是用:java.unit

public class bard02 {

  public static void main(String[] args) {
    // INPUT => 10 + 3 = 13;
    Scanner scanner = new Scanner(System.in);   // System.in :鍵盤輸入
    System.out.println("x = ");
    int x = scanner.nextInt();            // 執行後等待鍵盤輸入, 在下面console打整數才會印出
    System.out.println("y = ");
    int y = scanner.nextInt();
    int r = x + y;
    int a = x - y;
    int b = x * y;
    int c = x / y;  //整數除法
    int mod = x % y;  //這個才會有餘數
    System.out.printf("%d + %d = %d\n", x, y, r);   // "\n" :換列
    // printf :印出格式化輸出 (字串) ,%d後面的值, 一個一個代入
    System.out.printf("%d - %d = %d\n", x, y, a);
    System.out.printf("%d x %d = %d\n", x, y, b);
    System.out.printf("%d / %d = %d......%d\n", x, y, c, mod);
  }

}
