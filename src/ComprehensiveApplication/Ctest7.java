package ComprehensiveApplication;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest7 {
	public static void main(String[] args) {
		MulticastFrame frame = new MulticastFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

class MulticastFrame extends JFrame {
	public MulticastFrame() {
		setTitle("MulticastTest");
		setSize(WIDTH, HEIGHT);
		MulticastPanel panel = new MulticastPanel();
		Container contentPane = getContentPane();
		// *********Found**********
		contentPane.add(panel);
	}

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
}

class MulticastPanel extends JPanel {
	public MulticastPanel() {
		JButton newButton = new JButton("New");
		add(newButton);
		ActionListener newListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				makeNewFrame();
			}
		};
		newButton.addActionListener(newListener);
		closeAllButton = new JButton("Close all");
		add(closeAllButton);
	}

	private void makeNewFrame() {
		final BlankFrame frame = new BlankFrame();
		frame.show();
		ActionListener closeAllListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// *********Found**********
				frame.hide(); // 使窗口隐藏或消除
			}
		};
		// *********Found**********
		closeAllButton.addActionListener(closeAllListener);
	}

	private JButton closeAllButton;
}

class BlankFrame extends JFrame {
	public BlankFrame() {
		// *********Found**********
		counter++;
		setTitle("Frame " + counter);
		setSize(WIDTH, HEIGHT);
		setLocation(SPACING * counter, SPACING * counter);
	}

	public static final int WIDTH = 200;
	public static final int HEIGHT = 150;
	public static final int SPACING = 30;
	private static int counter = 0;
}
