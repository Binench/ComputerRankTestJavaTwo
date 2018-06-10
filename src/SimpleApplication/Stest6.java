package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest6 {
	public static void main(String args[]) {
		// *********Found**********
		int a[][] = new int[5][5];
		int i, j, k = 1;
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				if ((i + j) < 5) {
					a[i][j] = k;
					// *********Found**********
					k++;
					if (k > 9)
						k = 1;
				} else
					// *********Found**********
					a[i][j] = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++)
				System.out.print(a[i][j] + "   ");
			// *********Found**********
			System.out.println();
		}
	}
}
