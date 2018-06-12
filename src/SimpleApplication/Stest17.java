package SimpleApplication;

//*********Found********
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest17 implements ActionListener {
	JTextArea ta;
	JFrame f;
	JLabel label;
	JButton bt;

	public static void main(String args[]) {
		Stest17 t = new Stest17();
		t.go();
	}

	void go() {
		f = new JFrame("Save data");
		label = new JLabel("请输入需要保存的文本：");
		ta = new JTextArea(3, 20);
		bt = new JButton("保存");
		// *********Found********
		f.add(label, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(bt, BorderLayout.SOUTH);
		// *********Found********
		bt.addActionListener(this);
		f.setSize(400, 400);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent event) {
		try {
			FileWriter out = new FileWriter(
					/* 根目录下 */
					"out.txt");
			String str = ta.getText();
			// *********Found********
			out.write(str);
			out.close();
		} catch (Exception e) {
		}
	}
}
