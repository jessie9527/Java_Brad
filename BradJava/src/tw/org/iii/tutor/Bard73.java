package tw.org.iii.tutor;

import java.util.Timer;
import java.util.TimerTask;

public class Bard73 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Bard731 task = new Bard731();
		timer.schedule(task, 3*1000);
		timer.schedule(new Bard732(timer), 10*1000);
		// 10秒後結束
		timer.schedule(new Bard733(), 0, 1000);
		// 1秒印一個
		System.out.println("main");
	}

}

class Bard731 extends TimerTask {
	@Override
	public void run() {
		System.out.println("OK");
	}
}

class Bard732 extends TimerTask {
	private Timer timer;
	Bard732(Timer timer){
		this.timer = timer;
	}
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}

class Bard733 extends TimerTask {
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}

