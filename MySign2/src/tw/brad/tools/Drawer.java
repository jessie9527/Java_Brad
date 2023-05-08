package tw.brad.tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

// 例如:生產汽車工廠
public class Drawer extends JPanel {
//	private LinkedList<Point> points; // 我擁有points屬性, LinkedList用點做一條線
	private LinkedList<LinkedList<Point>> lines, recycleBin; // 我擁有lines屬性, LinkedList做多條線

	public Drawer() {
		setBackground(Color.YELLOW);
		lines = new LinkedList<>();
		// 把lines做初始化
		recycleBin = new LinkedList<>();
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}

	public void clear() {
		lines.clear();
		repaint();
	}

	public void undo() {
		if (lines.size() > 0) {
			recycleBin.add(lines.removeLast());
			// 把最後一條線丟掉進資源回收桶
			repaint();
		}
	}

	public void redo() {
		if (recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
			// 把資源回收桶東西撿起
			repaint();
		}
	}

	@Override
	// 任何時候畫面改變的邏輯在這邊
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 先呼叫原方法
		/*
		 * if (g instanceof DebugGraphics) { System.out.println("A");} else if (g
		 * instanceof Graphics2D) { System.out.println("B");}
		 */ // 判斷g是誰
		Graphics2D g2d = (Graphics2D) g; // 打回原形(強制轉型)
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));

		for (LinkedList<Point> line : lines) {
			// 跑迴圈做線段
			for (int i = 1; i < line.size(); i++) {
				// (例如:5個點有4個線段)
				Point p0 = line.get(i - 1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}

	}

	// 定義類別中的類別, 方便存取外部連結的方法, 例如:生產汽車工廠蓋一家輪胎工廠
	private class MyListener extends MouseAdapter {
		@Override
		// 以下利用滑鼠把點收集起來
		public void mousePressed(MouseEvent e) {
			recycleBin.clear();
			// 寫新線後資源回收桶的線全部刪除
			LinkedList<Point> line = new LinkedList<>();

			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			line.add(point); // 把點存放起來
			lines.add(line); // 創造新線
			repaint(); // 把分開事件集結在一起
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			lines.getLast().add(point); // 最後一條線後在加最後一點
			repaint(); // 把分開事件集結在一起
		}
	}
}

class Point {
	public int x, y;
}
