package ComprehensiveApplication;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest9 extends WindowAdapter implements ActionListener {
	private JFrame frame;
	private JTextField name;
	private JPasswordField pass;
	private JLabel nameLabel;
	private JLabel passLabel;
	private JPanel textPanel;
	private JPanel labelPanel;
	private JButton button;
	private JTextArea textArea;

	public void initGUI() {
		frame = new JFrame("Frame with Dialog");
		frame.addWindowListener(this);
		button = new JButton("JDialog");
		// *********Found**********
		button.addActionListener(this);
		textArea = new JTextArea("", 3, 10);

		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.NORTH);

		frame.setSize(400, 300);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		final JDialog dia = new JDialog(frame, "login information");
		JButton ok = new JButton("ok");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.append("name:" + name.getText() + "\r\n");
				textArea.append("passWord:" + new String(pass.getPassword()) + "\r\n");
				// *********Found**********
				dia.setVisible(false); // 隐藏对话框
			}
		});

		name = new JTextField("", 10);
		pass = new JPasswordField("", 10);
		pass.setEchoChar('*');
		textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(2, 1, 10, 10));
		textPanel.add(name);
		textPanel.add(pass);

		nameLabel = new JLabel("name");
		passLabel = new JLabel("passWord");
		labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(2, 1, 20, 20));
		labelPanel.add(nameLabel);
		labelPanel.add(passLabel);

		dia.getContentPane().add(labelPanel, BorderLayout.WEST);
		dia.getContentPane().add(textPanel, BorderLayout.CENTER);
		dia.getContentPane().add(ok, BorderLayout.SOUTH);
		dia.setSize(200, 130);
		dia.setVisible(true);
	}

	public void windowClosing(WindowEvent event) {
		frame.setVisible(false);
		System.exit(0);
	}

	public static void main(String args[]) {
		Ctest9 example = new Ctest9();
		// *********Found**********
		example.initGUI();
	}
}
