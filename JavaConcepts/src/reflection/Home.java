package reflection;

import pack3.Test;

public class Home {
	public static void main(String[] args) {
		Test t = new Test();
		Class c=t.getClass();
		System.out.println(c.getSimpleName());
		System.out.println("======================");
		Object obj = new Object();
		Class c2=obj.getClass();
		System.out.println(c2.getSimpleName());
		

	}

}
