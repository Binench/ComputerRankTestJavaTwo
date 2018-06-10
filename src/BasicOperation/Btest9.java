package BasicOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest9 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir;
		BufferedReader in;
		int sum, x;
		String data;
		// *********Found**********
		sum = 0;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		System.out.println("请输入5个整数：");
		// *********Found**********
		for (int i = 1; i <= 5; i++) {
			data = in.readLine();
			x = Integer.parseInt(data);
			// *********Found**********
			if (x % 2 == 0)
				sum += x;
		}
		System.out.println("偶数之和为" + sum);
	}
}
