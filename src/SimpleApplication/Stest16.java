package SimpleApplication;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:25:09 ��˵��
 */
public class Stest16 {
	public static void main(String args[]) {
		SubClass subC = new SubClass();
		subC.doSomething();
	}
}

class SuperClass {

	int x;

	SuperClass() {
		// *********Found********
		x = 3;
		System.out.println("in SuperClass : x=" + x);
	}

	void doSomething() {
		// *********Found********
		System.out.println("in SuperClass.doSomething()");
	}
}

class SubClass extends SuperClass {

	int x;

	SubClass() {
		super();
		// *********Found********
		x = 5;
		System.out.println("in SubClass  :x=" + x);
	}

	void doSomething() {
		super.doSomething();
		// *********Found********
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x=" + super.x + "  sub.x=" + x);
	}
}
