package BasicOperation;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest11 {
	public static void main(String[] args) {
		// *********Found**********
		int[] scores = { 90, 80, 75, 67, 53 };
		int best = 0;
		char grade;

		// �ҳ�����ɼ��е���߷�
		// *********Found**********
		for (int i = 0; i < scores.length; i++) {
			// *********Found**********
			if (best < scores[i])
				best = scores[i];
		}

		// ��������ĵȼ�����ʾ
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best - 10)
				grade = 'A';
			// *********Found**********
			else if (scores[i] >= best - 20)
				grade = 'B';
			else if (scores[i] >= best - 30)
				grade = 'C';
			else if (scores[i] >= best - 40)
				grade = 'D';
			else
				grade = 'F';
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
		}
	}
}
