package SimpleApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest4 extends Thread {
	private int x = 0;
	private int y = 0;

	public static void main(String[] args) {
		Stest4 r = new Stest4();
		// *********Found**********
		Thread t = new Thread(r);
		t.start();
	}

	public void run() {
		// *********Found**********
		int k = 0;
		for (;;) {
			x++;
			// *********Found**********
			y++;
			k++;
			if (k > 5)
				break;
			System.out.println("x=" + x + ",y =" + y);

		}
	}
}
