package BasicOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest10 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir;
		BufferedReader in;
		int max, x;
		String data;

		max = 0;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		System.out.println("������5����������");
		// *********Found**********
		for (int i = 1; i <= 5; i++) {
			data = in.readLine();
			// *********Found**********
			x = Integer.parseInt(data);
			if (max < x)
				// *********Found**********
				max = x;
		}
		System.out.println("��������ֵ�� " + max);
	}
}
