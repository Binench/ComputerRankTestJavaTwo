package ComprehensiveApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:28:10 ��˵��
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
			// Character �����ڶԵ����ַ����в���,toLowerCase()�������ڰ��ַ���ת��ΪСд,charAt()��������ָ������λ�õ�charֵ
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// *********Found*********
				vowels++;
			}
		}
		System.out.println("The text contained vowels: " + vowels + "\n");
	}
}
