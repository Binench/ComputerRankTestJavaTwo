package SimpleApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest5 {
	public static void main(String args[]) {
		try {
			Sleep a = new Sleep();
			Thread t = new Thread(a);
			// *********Found**********
			t.run();
			t.join();// �ø��̵߳ȴ����߳̽���֮����ܼ�������
			int j = a.i;
			System.out.println("j=" + j + ",a.i=" + a.i);
		} catch (Exception e) {
		}
	}
}

// *********Found**********
class Sleep implements Runnable {
	int i;

	public void run() {
		try {
			// *********Found**********
			Thread.sleep(50);
			i = 10;
		}
		// *********Found**********
		catch (InterruptedException e) {
		}
	}
}