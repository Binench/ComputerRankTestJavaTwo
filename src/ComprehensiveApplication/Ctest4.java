package ComprehensiveApplication;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
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
		pack();// �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ���
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