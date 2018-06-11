package ComprehensiveApplication;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*********Found**********
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest13 implements ActionListener {
	JFrame f;
	JPanel p;
	JColorChooser cc;
	Container c;
	Color myColor;
	JMenuBar mb;
	JMenu m1;
	JMenuItem mi1;

	public static void main(String args[]) {
		Ctest13 demo = new Ctest13();
		demo.go();
	}

	void go() {
		JFrame f = new JFrame("File Chooser Demo");
		mb = new JMenuBar();
		f.setJMenuBar(mb);
		m1 = new JMenu("Edit");
		mb.add(m1);
		mi1 = new JMenuItem("Choose Color");
		m1.add(mi1);
		mi1.addActionListener(this);
		// *********Found**********
		c = f.getContentPane();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		myColor = Color.red;
		p.setBackground(myColor);
		c.add("Center", p);
		f.setSize(300, 300);
		// *********Found**********
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// *********Found**********
		cc = new JColorChooser();
		myColor = cc.showDialog(c, "Choose window background color", Color.white);
		p.setBackground(myColor);
	}
}
