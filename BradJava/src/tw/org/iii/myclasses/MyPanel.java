package tw.org.iii.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private BufferedImage[] imgs;
	private Timer timer;
	private int viewW, viewH;
	private LinkedList<BallTask> balls;
	
	public MyPanel() {
		setBackground(Color.YELLOW);
		
		try {
			imgs = new BufferedImage[4];
			imgs[0] = ImageIO.read(new File("dir2/ball.png"));
			imgs[1] = ImageIO.read(new File("dir2/ball1.png"));
			imgs[2] = ImageIO.read(new File("dir2/ball2 .png"));
			imgs[3] = ImageIO.read(new File("dir2/ball3.png"));
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		balls = new LinkedList<>();
		timer = new Timer();
		// 更新畫面的頻率
		timer.schedule(new RefreshView(), 0, 16);
		// 滑鼠偵測
		addMouseListener(new MyMouseListener());
	}
	
	// 畫面
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth();
		viewH = getHeight();
		
		Graphics2D g2d = (Graphics2D)g;
		for (BallTask ball : balls) {
			g2d.drawImage(imgs[ball.img], ball.x, ball.y, null);			
		}
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			BallTask ball = new BallTask(e.getX()-32, e.getY()-32);
			balls.add(ball);		// 畫面點擊產生球
			timer.schedule(ball, 500, 30);		//讓球動起來
		}
	}
	
	private class RefreshView extends TimerTask{
		// 更新畫面
		@Override
		public void run() {
			repaint();
		}
		
	}
	
	private class BallTask extends TimerTask {
		public int x, y, dx, dy, img;
		public BallTask(int x, int y) {
			this.x = x;
			this.y = y;
			dx = (int)(Math.random()*7) -3;
			dy = (int)(Math.random()*7) -3;
			img = (int)(Math.random()*4);
		}
		
		@Override
		public void run() {
			// 判斷是否撞到牆壁(不要用if else if)
			if (x <= 0 || x + 64 >= viewW) {
				dx *= -1;
				// *= -1:負變正, 正變負
			}
			if (y <= 0 || y + 64 >= viewH) {
				dy *= -1;
			}
			x += dx;	// 常數移動方向	
			y += dy;
			
		}
	}
	
}
