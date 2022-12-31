package generics;

import java.awt.List;
import java.util.ArrayList;

public class UseGenericClass {
	public static void main(String[] args) {

		GenericClassExample<Integer> obj1 = new GenericClassExample<Integer>(23772);
		GenericClassExample<Double> obj2 = new GenericClassExample<Double>(128.238);
		God gd = null;
		//GenericClassExample<God> obj3 = new GenericClassExample<God>(gd);
		obj1.show();
		obj2.show();
		// obj3.show();

		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add(12923.2323);
		list1.add(true);
		list1.add("sfdf");
		m1(list1);

	}

	public static void m1(ArrayList<? extends Double>  list) {
		int var = 0;
		for (Object i : list) {
			//var = (Object)var + i;

		}

	}

}
