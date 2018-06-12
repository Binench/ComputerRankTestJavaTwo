package ComprehensiveApplication;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
 */
public class Ctest14 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// *********Found**********
		frame.getContentPane().add(new Change());

		frame.pack();
		// *********Found**********
		frame.setVisible(true);
	}
}

// ͬ�����⣬����ΪChange1
class Change1 extends JPanel {

	int count = 200;
	JLabel l1;
	JButton b1, b2;

	public Change1() {
		setPreferredSize(new Dimension(280, 60));
		l1 = new JLabel("200");
		b1 = new JButton("����");
		b2 = new JButton("��С");
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(new BListener1());
		// *********Found**********
		b2.addActionListener(new BListener2());
	}

	private class BListener1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			count++;
			l1.setText("" + count);
		}
	}

	private class BListener2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// *********Found**********
			count--;
			l1.setText("" + count);
		}
	}
}
