package BasicOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest10 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir;
		BufferedReader in;
		int max, x;
		String data;

		max = 0;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		System.out.println("请输入5个正整数：");
		// *********Found**********
		for (int i = 1; i <= 5; i++) {
			data = in.readLine();
			// *********Found**********
			x = Integer.parseInt(data);
			if (max < x)
				// *********Found**********
				max = x;
		}
		System.out.println("输入的最大值是 " + max);
	}
}
