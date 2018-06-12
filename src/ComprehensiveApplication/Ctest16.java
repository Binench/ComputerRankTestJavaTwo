package ComprehensiveApplication;

import java.awt.Container;
//*********Found********
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/** 
* @author 作者 binck: 
* @version 创建时间：2018年6月8日 下午3:28:10 
* 类说明 
*/
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//*********Found********
public class Ctest16 implements ActionListener {
	JFrame f;
	JTextArea ta;
	// *********Found********
	JFileChooser fc;
	Container c;
	File myFile;

	public static void main(String args[]) {
		Ctest16 demo = new Ctest16();
		demo.go();
	}

	void go() {
		f = new JFrame("File Chooser Demo");
		// *********Found********
		JButton b = new JButton("Open file");
		ta = new JTextArea("Where is your file path?", 10, 30);
		// *********Found********
		b.addActionListener(this);
		c = f.getContentPane();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// *********Found********
		f.getContentPane().add("South", b);
		f.getContentPane().add("Center", ta);
		f.setSize(300, 300);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		fc = new JFileChooser();
		int selected = fc.showOpenDialog(c);
		if (selected == JFileChooser.APPROVE_OPTION) {
			myFile = fc.getSelectedFile();
			ta.setText("You have selected file: " + myFile.getName());
		}
	}
}
