package SimpleApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest9 {
	public static void main(String args[]) {
		int i = 0;
		String greetings[] = { "Hello World!", "Hello!", "HELLO WORLD!!" };
		while (i < 4) {
			try {
				// *********Found********
				System.out.println(greetings[i]);
			}
			// *********Found********
			catch (ArrayIndexOutOfBoundsException e) {
				// *********Found********
				System.out.println("Catch " + e.getMessage());
				System.out.println("Ending the print.");
			} finally {
				System.out.println("---------------------");
			}
			// *********Found********
			i++;
		}
	}
}
