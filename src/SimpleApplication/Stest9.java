package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest9 {
	public static void main(String args[]) {
		int i = 0;
		String greetings[] = { "Hello World!", "Hello!", "HELLO WORLD!!" };
		while (i < 4) {
			try {
				// *********Found********
				System.out.println(greetings[i]);
			}
			// *********Found********
			catch (ArrayIndexOutOfBoundsException e) {
				// *********Found********
				System.out.println("Catch " + e.getMessage());
				System.out.println("Ending the print.");
			} finally {
				System.out.println("---------------------");
			}
			// *********Found********
			i++;
		}
	}
}
