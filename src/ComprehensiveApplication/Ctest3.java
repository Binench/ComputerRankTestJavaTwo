package ComprehensiveApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:28:10 类说明
 */
public class Ctest3 {
	public static void main(String[] args) {
		String text = "Beijing, the Capital City, is the political," + "cultural and diplomatic centre of China. It has"
				+ "become a modern international cosmopolitan city" + "with more than 11 million people. The Capital"
				+ "International Airport, 23.5 km from the city centre,"
				+ "is China's largest and most advanced airport.";
		int vowels = 0;
		// *********Found*********
		int textLength = text.length();
		for (int i = 0; i < textLength; i++) {
			// *********Found*********
			char ch = Character.toLowerCase(text.charAt(i));
			// Character 类用于对单个字符进行操作,toLowerCase()方法用于把字符串转换为小写,charAt()方法返回指定索引位置的char值
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// *********Found*********
				vowels++;
			}
		}
		System.out.println("The text contained vowels: " + vowels + "\n");
	}
}
