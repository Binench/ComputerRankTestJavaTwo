package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest19 {
	public static void main(String[] args) {
		int[] a = { 5, 9, 2, 8, 7 };
		int max = 0;
		int k = 0, t;
		for (int i = 0; i < 5; i++) {
			// *********Found********
			if (a[i] % 2 == 0 && max < a[i]) {
				max = a[i];
				// *********Found********
				k = i;
			}
		}
		t = a[0];
		a[0] = a[k];
		a[k] = t;
		// *********Found********
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "  ");
	}
}
