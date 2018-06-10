package ComprehensiveApplication;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*********Found**********
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest10 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// *********Found**********
		frame.getContentPane().add(new Change());

		frame.pack();
		frame.setVisible(true);
	}
}

class Change extends JPanel {

	int count = 200;
	JLabel l1;
	JButton b1, b2;

	public Change() {
		setPreferredSize(new Dimension(280, 60));
		l1 = new JLabel("200");
		b1 = new JButton("增大");
		b2 = new JButton("减小");
		add(l1);
		// *********Found**********
		add(b1);
		// *********Found**********
		add(b2);
		b1.addActionListener(new BListener());
		b2.addActionListener(new BListener());
	}

	// *********Found**********
	private class BListener implements ActionListener {

		// *********Found**********
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				count++;
			} else {
				count--;
			}
			l1.setText("" + count);
		}
	}
}
