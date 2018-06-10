package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest5 {
	public static void main(String args[]) {
		try {
			Sleep a = new Sleep();
			Thread t = new Thread(a);
			// *********Found**********
			t.run();
			t.join();// 让父线程等待子线程结束之后才能继续运行
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