package BasicOperation;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest7 {
	public static void main(String[] args) {
		int[] anArray; // 声明一个整数型数组
		// *********Found**********
		anArray = new int[10]; // 创建一个整数数组对象s
		// *********Found**********
		for (int i = 0; i < anArray.length; i++) { // 对数组中每个元素赋值并显示
			anArray[i] = i;
			// *********Found**********
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
