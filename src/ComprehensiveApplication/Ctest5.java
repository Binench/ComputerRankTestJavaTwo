package ComprehensiveApplication;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest5 {
	static final int WIDTH = 300;
	static final int HEIGHT = 200;

	public static void main(String[] args) {
		// *********Found**********
		JFrame jf = new JFrame();
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// *********Found**********
		jf.setTitle("股票分析系统");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);
		// *********Found**********
		jf.setVisible(true);
	}
}
