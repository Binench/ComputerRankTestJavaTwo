package SimpleApplication;

import java.io.File;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest10 {
	public static void main(String s[]) {
		// Getting the Current Working Directory
		String curDir = System.getProperty("user.dir");
		System.out.println("��ǰ�Ĺ���Ŀ¼��:" + curDir);

		// *********Found**********
		File ff = new File(curDir);
		String[] files = ff.list();
		for (int i = 0; i < files.length; i++) {
			String ss = curDir + "\\" + files[i];
			traverse(0, ss);
		}
	}

	/**
	 * �ݹ�ر���Ŀ¼��
	 * 
	 * @param level
	 *            Ŀ¼�Ĳ��
	 * @param s
	 *            ��ǰĿ¼·����
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
