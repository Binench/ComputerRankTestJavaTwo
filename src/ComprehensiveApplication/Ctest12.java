package ComprehensiveApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
 */
public class Ctest12 implements ActionListener {
	public static void main(String args[]) {
		Ctest12 t = new Ctest12();
		// *********Found**********
		JFrame f = new JFrame("Test");
		JButton b = new JButton("�����ļ�");
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
			/* �þ���·���Ϳ��Ե�����½� */
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
