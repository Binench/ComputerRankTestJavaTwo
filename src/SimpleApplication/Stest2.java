package SimpleApplication;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.TextArea;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest2 extends Applet {
	TextArea outputArea;

	public void init() {
		setLayout(new BorderLayout());
		outputArea = new TextArea();
		// *********Found********
		add(outputArea);

		// ����0��10�Ľ׳�
		for (long i = 0; i <= 10; i++)
			// *********Found********
			outputArea.append(i + "! = " + factorial(i) + "\n");
	}

	// �õݹ鶨��׳˷���
	public long factorial(long number) {
		if (number <= 1) // �������
			return 1;
		else
			// *********Found********
			return number * factorial(number - 1);
	}
}
