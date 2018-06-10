package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
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
