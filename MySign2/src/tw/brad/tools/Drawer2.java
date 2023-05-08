package tw.brad.tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Drawer2 extends JPanel {
    // 儲存所有的線段
    private LinkedList<Line> lines;
    // 儲存已刪除的線段，用以實現 undo / redo 功能
    private LinkedList<Line> recycleBin;
    // 目前選擇的顏色
    private Color nowColor;

    public Drawer2() {
        setBackground(Color.YELLOW);

        // 初始化
        nowColor = Color.BLUE;
        lines = new LinkedList<>();
        recycleBin = new LinkedList<>();

        // 設定 MouseListener / MouseMotionListener
        MyListener myListener = new MyListener();
        addMouseListener(myListener);
        addMouseMotionListener(myListener);
    }

    // 取得目前選擇的顏色
    public Color getColor() {
        return nowColor;
    }

    // 設定目前選擇的顏色
    public void setColor(Color color) {
        nowColor = color;
    }

    // 清除畫板上的所有線段
    public void clear() {
        lines.clear();
        repaint();
    }

    // 復原上一步操作（刪除最後一條線段）
    public void undo() {
        if (lines.size() > 0) {
            recycleBin.add(lines.removeLast());
            repaint();
        }
    }

    // 重做最後一次刪除的操作（新增最後一條被刪除的線段）
    public void redo() {
        if (recycleBin.size() > 0) {
            lines.add(recycleBin.removeLast());
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));

        // 畫出所有線段
        for (Line line : lines) {
            g2d.setColor(line.getColor());
            for (int i = 1; i < line.size(); i++) {
                Point p0 = line.getPoint(i - 1);
                Point p1 = line.getPoint(i);
                g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
            }
        }

    }

    private class MyListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            // 在點擊畫布時新增一條新的線段
            Line line = new Line(nowColor);

            Point point = new Point();
            point.x = e.getX();
            point.y = e.getY();
            line.addPoint(point);
            lines.add(line);

            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // 在拖曳時，將新的點加入最後一條線段中
            Point point = new Point();
            point.x = e.getX();
            point.y = e.getY();

            lines.getLast().addPoint(point);

            repaint();
        }
    }
}

// 線段類別，由多個點組成

class Line {
	private Color color;
	private LinkedList<Point> points;
	Line(Color color){
		this.color = color;
		points = new LinkedList<>();
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public LinkedList<Point> getPoints() {
		return points;
	}
	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}
	
	public void addPoint(Point point) {
		points.add(point);
	}
	
	public Point getPoint(int index) {
		return points.get(index);
	}
	
	public int size() {
		return points.size();
	}
}