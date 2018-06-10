package BasicOperation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest8 {
	// *********Found**********
	public static void main(String[] args) throws Exception {
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		System.out.println("输入年份是:");
		// *********Found**********
		String s = in.readLine();
		// *********Found**********
		int year = Integer.parseInt(s);
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("" + year + "年是闰年.");
		} else {
			System.out.println("" + year + "年不是闰年.");
		}
	}
}
