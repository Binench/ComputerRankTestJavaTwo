package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest14 {
	public static void main(String[] args) {
		// *********Found**********
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++)
				// *********Found**********
				System.out.print(" ");
			;
			// *********Found**********
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			// *********Found**********
			System.out.println();
			;
		}
	}
}
