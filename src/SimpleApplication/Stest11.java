package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest11 {
	public static void main(String[] args) {
		Point pt;
		// *********Found**********
		pt = new Point(2, 3);
		System.out.println(pt);
	}
}

class Point {

	// *********Found**********
	private int x;
	private int y;

	// *********Found**********
	public Point(int a, int b) {
		x = a;
		y = b;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int a) {
		x = a;
	}

	void setY(int b) {
		y = b;
	}

	// *********Found**********
	public String toString() {
		return "( " + x + "," + y + " ) ";
	}
}