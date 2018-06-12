package SimpleApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest18 {
	public static void main(String args[]) {
		String ShowMes[] = { "在那山的那边海的那边有一群蓝精灵", "它们活泼又聪明它们调皮又灵敏", "它们自由自在生活在那绿色的大森林", "它们善良勇敢相互都欢喜！" };
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
			/*项目的根目录下*/
			FileReader in = new FileReader(new File("test18.txt"));
			BufferedReader inBR = new BufferedReader(in);
			String stext = null;
			int j = 1;
			while ((stext = inBR.readLine()) != null) {
				System.out.println("第" + j + "行内容：" + stext);
				// *********Found********
				j++;
			}
			inBR.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
