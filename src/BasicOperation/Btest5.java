package BasicOperation;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:22:54 类说明
 */
public class Btest5 {

	public static void main(String[] args) {
		byte b = 10; // 二进制表示00001010
		// *********Found**********
		byte c = 0x000f;// 0x000f（16进制），15（10进制），000017（八进制）都行
		b = (byte) (b ^ c);
		// *********Found**********
		System.out.println("b的结果是：" + b);
	}
}
