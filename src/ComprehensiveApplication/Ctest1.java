package ComprehensiveApplication;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
 */
public class Ctest1 extends JFrame implements ActionListener {
	private JTextField input1, input2, output;
	private int number1, number2;
	private double result;

	// ��ʼ��
	public Ctest1() {
		// *********Found********
		super("ʾ���쳣");// ����һ���ޱ���Ĵ��壬��ʼ���ɼ�

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));

		c.add(new JLabel("�������", SwingConstants.RIGHT));
		input1 = new JTextField(10);
		c.add(input1);

		c.add(new JLabel("�����ĸ�ͻس�", SwingConstants.RIGHT));
		input2 = new JTextField(10);
		c.add(input2);
		input2.addActionListener(this);

		c.add(new JLabel("������", SwingConstants.RIGHT));
		output = new JTextField();
		c.add(output);

		setSize(425, 100);
		show();
	}

	// ���� GUI �¼�
	public void actionPerformed(ActionEvent e) {
		/* ��ʽ��ʮ�������� */
		DecimalFormat precision3 = new DecimalFormat("0.000");

		output.setText(""); // �յ�JTextField���

		// *********Found********
		try {
			number1 = Integer.parseInt(input1.getText());
			number2 = Integer.parseInt(input2.getText());

			result = quotient(number1, number2);
			// *********Found********
			output.setText(precision3.format(result));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "�����������������", "�Ƿ����ָ�ʽ", JOptionPane.ERROR_MESSAGE);
		} catch (Exception dbze) {
			// *********Found********
			JOptionPane.showMessageDialog(this, "�����쳣", "����Ϊ��", JOptionPane.ERROR_MESSAGE);
		}
	}

	// �������̵ķ�������������Ϊ��ʱ�����׳��쳣��
	public double quotient(int numerator, int denominator) throws Exception {
		if (denominator == 0)
			throw new Exception();

		return (double) numerator / denominator;
	}

	public static void main(String args[]) {
		Ctest1 app = new Ctest1();

		app.addWindowListener(new WindowAdapter() {
			/* ����������ڵĹرհ�ťʱ�������¼� */
			public void windowClosing(WindowEvent e) {
				e.getWindow().dispose();// ֻ�ǹرմ���
				System.exit(0);// �����������������ݶ�ͣ����
			}
		});
	}
}
/*
 * JOptionPane��ĳ��þ�̬�������£� showInputDialog() showConfirmDialog()
 * showMessageDialog() showOptionDialog()
 */
