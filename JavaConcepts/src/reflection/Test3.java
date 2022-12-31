package reflection;

import java.lang.reflect.Method;

public class Test3 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Class clas = t2.getClass();
		System.out.println(clas.getSimpleName());
		Method[] methods = clas.getDeclaredMethods();
		System.out.println("Total methods name: "+methods.length+" return type is:");
		for (Method m : methods) {
			System.out.println(m.getName()+" return type is : "+m.getReturnType());
		}

	}

}
