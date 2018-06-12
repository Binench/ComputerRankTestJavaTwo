package SimpleApplication;
/** 
* @author 作者 binck: 
* @version 创建时间：2018年6月8日 下午3:25:09 
* 类说明 
*/
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

//*********Found********
public class Stest19 implements ActionListener{
	JTable table = null;
	DefaultTableModel defaultModel = null;
	
        //*********Found********
        public Stest19(){
		JFrame f = new JFrame();
		String[] name = {"字段 1","字段 2","字段 3","字段 4","字段 5"};
		String[][] data = new String[5][5];		
                int value =1;
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length ; j++)
				data[i][j] = String.valueOf(value++);
		}		
		defaultModel = new DefaultTableModel(data,name);
		table=new JTable(defaultModel);
		table.setPreferredScrollableViewportSize(new Dimension(400, 80));
		JScrollPane s = new JScrollPane(table);

		JPanel panel = new JPanel();
		JButton b = new JButton("增加行");
		panel.add(b);
	
		//*********Found********
	        b.addActionListener(this);
		b = new JButton("删除行");
		panel.add(b);
		b.addActionListener(this);
	
		//*********Found********
                Container contentPane = f.getContentPane();
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(s, BorderLayout.CENTER);

		//*********Found********
		f.setTitle("增删表格行");
		f.pack();
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
					System.exit(0);
			}
		});
		//*********Found********
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(table.isCellSelected(table.getSelectedRow(), table.getSelectedColumn())){
					int selRow=table.getSelectedRow();
					int selCol=table.getSelectedColumn();
				JOptionPane.showMessageDialog(null, 
						"位于 ("+selRow+","+selCol+")的元素： "+table.getValueAt(selRow,selCol), 
						"PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
				}
				}
		   });
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("增加行"))    
			defaultModel.addRow(new Vector());
		if(e.getActionCommand().equals("删除行")){
			int rowcount = defaultModel.getRowCount()-1; //getRowCount返回行数，rowcount<0代表已经没有任何行了。
			if(rowcount >= 0){
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
