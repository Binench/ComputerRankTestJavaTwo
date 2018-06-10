package SimpleApplication;

import java.io.File;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest10 {
	public static void main(String s[]) {
		// Getting the Current Working Directory
		String curDir = System.getProperty("user.dir");
		System.out.println("当前的工作目录是:" + curDir);

		// *********Found**********
		File ff = new File(curDir);
		String[] files = ff.list();
		for (int i = 0; i < files.length; i++) {
			String ss = curDir + "\\" + files[i];
			traverse(0, ss);
		}
	}

	/**
	 * 递归地遍历目录树
	 * 
	 * @param level
	 *            目录的层次
	 * @param s
	 *            当前目录路径名
	 */
	public static void traverse(int level, String s) {
		File f = new File(s);
		for (int i = 0; i < level; i++)
			System.out.print("   ");
		if (f.isFile()) {
			System.out.println(f.getName());
		} else if (f.isDirectory()) {
			// *********Found**********
			System.out.println("<" + f.getName() + ">");
			String[] files = f.list();
			level++;
			// *********Found**********
			for (int i = 0; i < files.length; i++) {
				String ss = s + "\\" + files[i];
				// *********Found**********
				traverse(level, ss);
			}
		} else {
			System.out.println("ERROR!");
		}
	}
}
