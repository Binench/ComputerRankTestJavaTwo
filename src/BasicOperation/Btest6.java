package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest6 {
	// *********Found**********
	public static void main(String args[]) {
		String string = "����ѧϰ��η���һ���ַ���";
		System.out.println("�ַ��� \"" + string + "\"");
		// *********Found**********
		System.out.println("�ַ������ȣ�" + string.length());
		// *********Found**********
		System.out.println("���е�7���ַ��ǣ�" + string.charAt(6));
		char sub[] = new char[20];
		System.out.print("���ֽ�����ĵ�7��12��ȡ�ַ��ǣ�");
		string.getChars(6, 12, sub, 0);
		System.out.println(sub);
	}
}
