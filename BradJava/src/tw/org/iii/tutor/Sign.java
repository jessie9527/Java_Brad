package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.Drawer2;
import tw.org.iii.myclasses.Drawer3;
import tw.org.iii.myclasses.MyClock;

public class Sign extends JFrame{
	private Drawer3 drawer;
	private JButton clear, undo, redo, chColor, saveObj, loadObj, saveJPEG;
	private MyClock myClock;
	// 建立視窗物件
	public Sign() {
		super("簽名");
		
		drawer = new Drawer3();
		setLayout(new BorderLayout());
		add(drawer, BorderLayout.CENTER);
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		saveObj = new JButton("Save Obj");
		loadObj = new JButton("Load Obj");
		saveJPEG = new JButton("Save JPEG");
		myClock = new MyClock();
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo);
		top.add(chColor);top.add(saveObj);top.add(loadObj);
		top.add(saveJPEG);
		top.add(myClock);
		
		add(top, BorderLayout.NORTH);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跟Drawer物件說要把線全部清除(叫Drawer做事)
				drawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawer.undo();
				// 這裡是在Drawer做好的功能
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawer.redo();
			}
		});
		
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObject();
			}
		});
		
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObject();
			}
		});
		
		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawer.saveJPEG();	// 這方法寫在Drawer3
			}
		});
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeColor() {
//		Color newColor = JColorChooser.showDialog(null, "Change Color", drawer.getColor());
//		if (newColor != null) {
//			drawer.setColor(newColor);
//		}
	}
	
	private void saveObject() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			drawer.saveLines(file.getAbsolutePath());
		}
		drawer.saveLines("dir1/lines");
	}
	
	private void loadObject() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			drawer.saveLines(file.getAbsolutePath());
		}
		drawer.loadLines("dir1/lines");
	}
	
	public static void main(String[] args) {
		new Sign();
	}
	

}
