package SimpleApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
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

/* ����Point���������ﶨ�壬����ΪPoint1 */
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