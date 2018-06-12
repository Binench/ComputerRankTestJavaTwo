package SimpleApplication;

/** 
* @author ���� binck: 
* @version ����ʱ�䣺2018��6��8�� ����3:25:09 
* ��˵�� 
*/
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//*********Found********
public class Stest19 implements ActionListener {
	JTable table = null;
	DefaultTableModel defaultModel = null;

	// *********Found********
	public Stest19() {
		JFrame f = new JFrame();
		String[] name = { "�ֶ� 1", "�ֶ� 2", "�ֶ� 3", "�ֶ� 4", "�ֶ� 5" };
		String[][] data = new String[5][5];
		int value = 1;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++)
				data[i][j] = String.valueOf(value++);
		}
		defaultModel = new DefaultTableModel(data, name);
		table = new JTable(defaultModel);
		table.setPreferredScrollableViewportSize(new Dimension(400, 80));
		JScrollPane s = new JScrollPane(table);

		JPanel panel = new JPanel();
		JButton b = new JButton("������");
		panel.add(b);

		// *********Found********
		b.addActionListener(this);
		b = new JButton("ɾ����");
		panel.add(b);
		b.addActionListener(this);

		// *********Found********
		Container contentPane = f.getContentPane();
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(s, BorderLayout.CENTER);

		// *********Found********
		f.setTitle("��ɾ�����");
		f.pack();
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// *********Found********
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (table.isCellSelected(table.getSelectedRow(), table.getSelectedColumn())) {
					int selRow = table.getSelectedRow();
					int selCol = table.getSelectedColumn();
					JOptionPane.showMessageDialog(null,
							"λ�� (" + selRow + "," + selCol + ")��Ԫ�أ� " + table.getValueAt(selRow, selCol),
							"PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("������"))
			defaultModel.addRow(new Vector());
		if (e.getActionCommand().equals("ɾ����")) {
			int rowcount = defaultModel.getRowCount() - 1; // getRowCount����������rowcount<0�����Ѿ�û���κ����ˡ�
			if (rowcount >= 0) {
				defaultModel.removeRow(rowcount);
				defaultModel.setRowCount(rowcount);
			}
		}
		table.revalidate();
	}

	public static void main(String[] args) {
		new Stest19();
	}
}
