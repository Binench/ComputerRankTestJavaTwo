package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest15 {
	public static void main(String[] args) {
		int a, x = 2008;
		// *********Found**********
		System.out.print(x + " -> ");
		while (x != 0) {
			// *********Found**********
			a = x % 10;
			System.out.print(a);
			// *********Found**********
			x = x / 10;
		}
	}
}
