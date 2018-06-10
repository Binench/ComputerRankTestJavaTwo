package ComprehensiveApplication;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest1 extends JFrame implements ActionListener {
	private JTextField input1, input2, output;
	private int number1, number2;
	private double result;

	// 初始化
	public Ctest1() {
		// *********Found********
		super("示范异常");// 构造一个无标题的窗体，初始不可见

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));

		c.add(new JLabel("输入分子", SwingConstants.RIGHT));
		input1 = new JTextField(10);
		c.add(input1);

		c.add(new JLabel("输入分母和回车", SwingConstants.RIGHT));
		input2 = new JTextField(10);
		c.add(input2);
		input2.addActionListener(this);

		c.add(new JLabel("计算结果", SwingConstants.RIGHT));
		output = new JTextField();
		c.add(output);

		setSize(425, 100);
		show();
	}

	// 处理 GUI 事件
	public void actionPerformed(ActionEvent e) {
		/* 格式化十进制数字 */
		DecimalFormat precision3 = new DecimalFormat("0.000");

		output.setText(""); // 空的JTextField输出

		// *********Found********
		try {
			number1 = Integer.parseInt(input1.getText());
			number2 = Integer.parseInt(input2.getText());

			result = quotient(number1, number2);
			// *********Found********
			output.setText(precision3.format(result));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "你必须输入两个整数", "非法数字格式", JOptionPane.ERROR_MESSAGE);
		} catch (Exception dbze) {
			// *********Found********
			JOptionPane.showMessageDialog(this, "除法异常", "除数为零", JOptionPane.ERROR_MESSAGE);
		}
	}

	// 定义求商的方法，如遇除数为零时，能抛出异常。
	public double quotient(int numerator, int denominator) throws Exception {
		if (denominator == 0)
			throw new Exception();

		return (double) numerator / denominator;
	}

	public static void main(String args[]) {
		Ctest1 app = new Ctest1();

		app.addWindowListener(new WindowAdapter() {
			/* 当鼠标点击窗口的关闭按钮时触发的事件 */
			public void windowClosing(WindowEvent e) {
				e.getWindow().dispose();// 只是关闭窗口
				System.exit(0);// 将整个虚拟机里的内容都停掉了
			}
		});
	}
}
/*
 * JOptionPane类的常用静态方法如下： showInputDialog() showConfirmDialog()
 * showMessageDialog() showOptionDialog()
 */
