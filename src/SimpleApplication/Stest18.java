package SimpleApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest18 {
	public static void main(String args[]) {
		String ShowMes[] = { "����ɽ���Ǳߺ����Ǳ���һȺ������", "���ǻ����ִ������ǵ�Ƥ������", "����������������������ɫ�Ĵ�ɭ��", "���������¸��໥����ϲ��" };
		try {
			// *********Found********
			FileWriter out = new FileWriter(new File("test18.txt"));
			BufferedWriter outBW = new BufferedWriter(out);
			for (int i = 0; i < ShowMes.length; i++) {
				outBW.write(ShowMes[i]);
				outBW.newLine();
			}
			// *********Found********
			outBW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// *********Found********
			/*��Ŀ�ĸ�Ŀ¼��*/
			FileReader in = new FileReader(new File("test18.txt"));
			BufferedReader inBR = new BufferedReader(in);
			String stext = null;
			int j = 1;
			while ((stext = inBR.readLine()) != null) {
				System.out.println("��" + j + "�����ݣ�" + stext);
				// *********Found********
				j++;
			}
			inBR.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
