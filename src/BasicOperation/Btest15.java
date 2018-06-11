package BasicOperation;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest15 {
	public static void main(String[] args) {
		int a, x = 2008;
		// *********Found**********
		System.out.print(x + " -> ");
		while (x != 0) {
			// *********Found**********
			a = x % 10;
			System.out.print(a);
			// *********Found**********
			x = x / 10;
		}
	}
}
