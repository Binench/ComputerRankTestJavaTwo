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
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
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
		label = new JLabel("��������Ҫ������ı���");
		ta = new JTextArea(3, 20);
		bt = new JButton("����");
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
					/* ��Ŀ¼�� */
					"out.txt");
			String str = ta.getText();
			// *********Found********
			out.write(str);
			out.close();
		} catch (Exception e) {
		}
	}
}
