package SimpleApplication;

import java.util.Random;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest1 {
	public static void main(String[] args) {
		Random random = new Random();
		float x = random.nextFloat();// ����0.0��1.0֮���һ����������[0.0��1.0����
		int n = Math.round(20 * x); // ����20���ڵ�һ������(Math.round��������)
		long f = 1; // ����׳˵Ľ��
		int k = 1; // ѭ������
		// *********Found********
		do {
			f = f * k;// f*=k
			k++;
			// *********Found********
		} while (k <= n);
		System.out.println(n + "!= " + f);
	}
}
