package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest15 extends Thread {
	private String sThreadName;

	public static void main(String argv[]) {
		Stest15 first = new Stest15("first");
		// *********Found**********
		first.start();
		Stest15 second = new Stest15("second");
		// *********Found**********
		second.start();
	}

	// *********Found**********
	public Stest15(String s) {
		sThreadName = s;
	}

	public String getThreadName() {
		return sThreadName;
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			// *********Found**********
			System.out.println(getThreadName() + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
