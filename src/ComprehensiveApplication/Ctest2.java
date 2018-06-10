package ComprehensiveApplication;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
 */
public class Ctest2 {
	public static void main(String[] args) {
		FontFrame frame = new FontFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

// *********Found********
class FontFrame extends JFrame {
	public FontFrame() {
		setTitle("��԰��.ѩ");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		FontPanel panel = new FontPanel();
		Container contentPane = getContentPane();
		// *********Found********
		contentPane.add(panel);
	}

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
}

// *********Found********
class FontPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		String message = "��������������񳯣�";
		Font f = new Font("����", Font.BOLD, 24);
		g2.setFont(f);
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(message, context);
		double x = (getWidth() - bounds.getWidth()) / 2;
		double y = (getHeight() - bounds.getHeight()) / 2;
		double ascent = -bounds.getY();
		double baseY = y + ascent;
		g2.setPaint(Color.RED);
		// *********Found********
		g2.drawString(message, (int) x, (int) (baseY));
	}
}