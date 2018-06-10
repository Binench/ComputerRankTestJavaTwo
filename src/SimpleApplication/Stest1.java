package SimpleApplication;

import java.util.Random;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest1 {
	public static void main(String[] args) {
		Random random = new Random();
		float x = random.nextFloat();// 产生0.0与1.0之间的一个符点数（[0.0，1.0））
		int n = Math.round(20 * x); // 构造20以内的一个整数(Math.round四舍五入)
		long f = 1; // 保存阶乘的结果
		int k = 1; // 循环变量
		// *********Found********
		do {
			f = f * k;// f*=k
			k++;
			// *********Found********
		} while (k <= n);
		System.out.println(n + "!= " + f);
	}
}
