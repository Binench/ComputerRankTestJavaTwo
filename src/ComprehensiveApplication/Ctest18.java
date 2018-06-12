package ComprehensiveApplication;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest18 extends JFrame {
	private JLabel label;
	private JFileChooser fileChooser;
	private ImagePanel panel;

	public Ctest18() {
		setTitle("图片浏览器");
		setSize(500, 400);
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));// 设置默认路径为当前目录
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("文件");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("打开图片");
		menu.add(openItem);
		panel = new ImagePanel();
		add(panel);
		// *********Found********
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int result = fileChooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = fileChooser.getSelectedFile().getPath();
					// *********Found********
					panel.setImage(name);
					panel.repaint();
				}
			}
		});
		JMenuItem exitItem = new JMenuItem("退出图片");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// *********Found********
		Ctest18 frame = new Ctest18();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// *********Found********
		frame.setVisible(true);
	}
}

// *********Found********
class ImagePanel extends JPanel {
	private Image image;
	private int showWidth;
	private int showHeight;

	public void setImage(String fileName) {
		try {
			image = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image == null)
			return;
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);
		int width = getWidth();
		int height = getHeight();
		if (imageWidth > width) {
			this.showWidth = width;
		} else {
			this.showWidth = imageWidth;
		}
		if (imageHeight > height) {
			this.showHeight = height;
		} else {
			this.showHeight = imageHeight;
		}
		g.drawImage(image, 0, 0, showWidth, showHeight, null, null);
	}
}