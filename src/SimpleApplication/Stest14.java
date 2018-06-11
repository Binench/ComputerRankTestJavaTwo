package SimpleApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest14 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			File f = new File("Person.dat");
			// *********Found**********
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(new Person("小王"));
			oos.close();
			ois = new ObjectInputStream(new FileInputStream(f));
			// *********Found**********
			Person d = (Person) ois.readObject();
			System.out.println(d);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// *********Found**********
class Person implements Serializable {
	String name = null;

	public Person(String s) {
		name = s;
	}

	// *********Found**********
	public String toString() {
		return name;
	}
}
