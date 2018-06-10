package ComprehensiveApplication;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest4 {
	public static void main(String[] args) {
		BeijingFrame frame = new BeijingFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

// *********Found*********
class BeijingFrame extends JFrame {
	public BeijingFrame() {
		setTitle("Welcome to Beijing");
		Container contentPane = getContentPane();
		BeijingPanel panel = new BeijingPanel();
		contentPane.add(panel);
		pack();// 调整此窗口的大小，以适合其子组件的首选大小和布局
	}
}

class BeijingPanel extends JPanel {
	public BeijingPanel() {
		// *********Found*********
		setLayout(new BorderLayout());
		ImageIcon icon = new ImageIcon("tiantan.jpg");
		// *********Found*********
		jLC = new JLabel(icon);
		add(jLC, BorderLayout.CENTER);
		lpanel = new JPanel();
		jLS = new JLabel("The Temple of Heaven");
		lpanel.add(jLS);
		add(lpanel, BorderLayout.SOUTH);
	}

	private JLabel jLC;
	private JLabel jLS;
	private JPanel panel;
	private JPanel lpanel;
}