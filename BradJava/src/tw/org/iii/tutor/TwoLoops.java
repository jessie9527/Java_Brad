package tw.org.iii.tutor;

class Even implements Runnable {
    public void run() {
        try {
            for(int i = 0; i < 20; i += 2) { 
                System.out.println(i);
                Thread.sleep((long)(Math.random() * 100));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

class Odd implements Runnable {
    public void run() {
        try {
            for(int i = 1; i < 20; i += 2) {
                System.out.println(i);
                Thread.sleep((long)(Math.random() * 100));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class TwoLoops {
    public static void main(String args[]) {
        new Thread(new Even()).start();
        new Thread(new Odd()).start();
        System.out.println("主執行緒結束");
    }
}
