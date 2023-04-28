package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 可以修改加上數字按鈕

public class GuessNum extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;

	public GuessNum() {
		super("猜數字遊戲");

		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();

		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER); // 中間代表東南西北都設定好其他都是我的

		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

		guess.addActionListener(this);
		// 不能寫new GuessNum() 傳遞參數的方法,而是要寫自己要用'this'

		// 製作視窗
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		newGame();

	}

	public static void main(String[] args) {
		new GuessNum();
	}
	
	private void initView() {
		input.setFont(new Font(null, Font.BOLD, 24));
		input.setFont(new Font(null, Font.BOLD|Font.ITALIC, 20));
		// ( ,字體粗細, 字體大小)
	}
	
	private void newGame() {
		answer = createAnswer(3);
		//System.out.println("answer = " + answer);
		log.setText("");
		input.setText("");
		counter = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strInput = input.getText();
		
		if (isValid(strInput)) {
			counter++;
			
//			String strInput = input.getText();
			String result = checkAB(strInput);
			log.append(String.format("%d. %s => %s \n", counter, strInput, result));
			input.setText("");
			
			if (result.equals("3A0B")) {
				// 字串比對用equals
				JOptionPane.showMessageDialog(null, "恭喜老爺");
				newGame();
			}else if (counter == 10) {
				JOptionPane.showMessageDialog(null, "魯蛇: answer = " + answer);
				newGame();
			}
			
		}
		
	}
	
	private boolean isValid(String g) {
		return true;
	}

	private String checkAB(String g) {
		int A, B;
		A = B = 0;
		for (int i = 0; i < g.length(); i++) {
			char c = g.charAt(i);
			if (c == answer.charAt(i)) {
				// c是否存在於anwer的i位置中
				A++;
			} else if (answer.indexOf(c) >= 0) {
				// c是否存在於anwer中
				// 使用indexOf()判斷位子等於-1表示陣列越界
				B++;
			}
		}

		return String.format("%dA%dB", A, B);
	}

	private String createAnswer(int n) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(poker[i]);
		}

		return sb.toString();
	}

}

// 我要實作ActionListener
class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}

}
