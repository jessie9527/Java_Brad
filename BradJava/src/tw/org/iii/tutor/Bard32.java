package tw.org.iii.tutor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bard32 extends JFrame {
	private JButton b1, b2, b3;

	public Bard32() {
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);

//		b1.addActionListener(new MyListenerV2("b1"));
//		b2.addActionListener(new MyListenerV2("b2"));
//		b3.addActionListener(new MyListenerV2("b3"));
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		b3.addActionListener(this);
//		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B11");
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B21");
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B31");
			}
		});

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Bard32();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("b1");
		} else if (e.getSource() == b2) {
			System.out.println("b2");
		} else if (e.getSource() == b3) {
			System.out.println("b3");
		}
	}
}

class MyListener1 implements ActionListener {
	private String who;

	public MyListener1(String who) {
		this.who = who;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 我委託的物件會自己觸發, 然後有自帶參數, 去看參數有甚麼功能
		System.out.println("A" + e.getActionCommand());
	}

}
