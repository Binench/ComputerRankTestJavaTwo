package ComprehensiveApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest12 implements ActionListener {
	public static void main(String args[]) {
		Ctest12 t = new Ctest12();
		// *********Found**********
		JFrame f = new JFrame("Test");
		JButton b = new JButton("复制文件");
		b.setSize(100, 40);
		b.addActionListener(t);
		f.setSize(400, 400);
		// *********Found**********
		f.getContentPane().add(b);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent event) {
		try {
			// *********Found**********
			/* 用绝对路径就可以导入和新建 */
			FileInputStream in = new FileInputStream(
					"E:\\eclipse project\\Computer_Rank_Test_Java_two\\src\\ComprehensiveApplication\\a.txt");
			// *********Found**********
			FileOutputStream out = new FileOutputStream(
					"E:\\eclipse project\\Computer_Rank_Test_Java_two\\src\\ComprehensiveApplication\\b.txt");
			int c;
			while ((c = in.read()) != -1)
				out.write(c);
			in.close();
			out.close();
		} catch (Exception e) {
		}
	}
}
