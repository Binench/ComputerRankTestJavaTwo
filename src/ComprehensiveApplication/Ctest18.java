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
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
 */
public class Ctest18 extends JFrame {
	private JLabel label;
	private JFileChooser fileChooser;
	private ImagePanel panel;

	public Ctest18() {
		setTitle("ͼƬ�����");
		setSize(500, 400);
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));// ����Ĭ��·��Ϊ��ǰĿ¼
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("�ļ�");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("��ͼƬ");
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
		JMenuItem exitItem = new JMenuItem("�˳�ͼƬ");
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