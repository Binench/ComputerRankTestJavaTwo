package BasicOperation;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest14 {
	public static void main(String[] args) {
		// *********Found**********
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++)
				// *********Found**********
				System.out.print(" ");
			;
			// *********Found**********
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			// *********Found**********
			System.out.println();
			;
		}
	}
}
