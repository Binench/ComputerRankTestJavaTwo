package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest7 {
	public static void main(String[] args) {
		int[] anArray; // ����һ������������
		// *********Found**********
		anArray = new int[10]; // ����һ�������������s
		// *********Found**********
		for (int i = 0; i < anArray.length; i++) { // ��������ÿ��Ԫ�ظ�ֵ����ʾ
			anArray[i] = i;
			// *********Found**********
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
