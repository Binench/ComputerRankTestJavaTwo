package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest5 {

	public static void main(String[] args) {
		byte b = 10; // �����Ʊ�ʾ00001010
		// *********Found**********
		byte c = 0x000f;// 0x000f��16���ƣ���15��10���ƣ���000017���˽��ƣ�����
		b = (byte) (b ^ c);
		// *********Found**********
		System.out.println("b�Ľ���ǣ�" + b);
	}
}
