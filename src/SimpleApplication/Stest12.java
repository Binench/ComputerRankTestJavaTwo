package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest12 {
	public static void main(String[] args) {
		// *********Found**********
		Point1[] pt = new Point1[2];
		pt[0] = new Point1();
		pt[1] = new Point1(2, 3);
		// *********Found**********
		for (int i = 0; i < pt.length; i++) {
			System.out.print(pt[i]);
		}
	}
}

/* 由于Point在其它类里定义，改名为Point1 */
class Point1 {

	private int x;
	private int y;

	public Point1() {
		this(0, 0);
	}

	// *********Found**********
	public Point1(int a, int b) {
		x = a;
		y = b;
	}

	int getX() {
		return x;
	}

	int getY() {
		// *********Found**********
		return y;
	}

	void setX(int a) {
		x = a;
	}

	void setY(int b) {
		y = b;
	}

	public String toString() {
		return "  ( " + x + "," + y + " ) ";
	}
}