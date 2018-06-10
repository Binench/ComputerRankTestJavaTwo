package ComprehensiveApplication;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest8 implements ActionListener {
	JFrame f;
	JTextArea ta;
	JFileChooser fc;
	Container c;
	File myFile;

	public static void main(String args[]) {
		Ctest8 demo = new Ctest8();
		demo.go();
	}

	void go() {
		JFrame f = new JFrame("File Chooser Demo");
		JButton b = new JButton("Open file");
		ta = new JTextArea("Where is your file path?", 10, 30);
		// *********Found**********
		b.addActionListener(this);
		c = f.getContentPane();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add("South", b);
		f.getContentPane().add("Center", ta);
		f.setSize(300, 300);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		fc = new JFileChooser();
		// *********Found**********
		int selected = fc.showOpenDialog(c);
		if (selected == JFileChooser.APPROVE_OPTION) {
			myFile = fc.getSelectedFile();
			// *********Found**********
			ta.setText("You have selected file: " + myFile.getName());
		}
	}
}
