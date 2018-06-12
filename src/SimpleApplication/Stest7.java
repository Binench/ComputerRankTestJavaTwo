package SimpleApplication;

import java.io.FileInputStream;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest7 {
	public static void main(String[] args) {
		// *********Found**********
		byte buf[] = new byte[5];
		int len = 0, c1 = 0, c2 = 0;
		// *********Found**********
		try {
			// *********Found**********
			/* 根目录下 */
			FileInputStream in = new FileInputStream("test.txt");
			while ((len = in.read(buf, 0, 5)) > 0) {
				for (int i = 0; i < len; i++)
					if (buf[i] >= '0' && buf[i] <= '9') {
						c1++;
					} else if ((buf[i] >= 'a' && buf[i] <= 'z') || buf[i] >= 'A' && buf[i] <= 'Z')
						c2++;
				if (len < 5)
					break;
			}
			// *********Found**********
			in.close();
		} catch (Exception e) {
		}
		System.out.println("数字数是 " + c1 + "，字母数是 " + c2);
	}
}
