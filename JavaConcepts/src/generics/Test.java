package generics;

import java.util.ArrayList;

public class Test {

	public static ArrayList al = new ArrayList<>();

	public static void main(String[] args) {

		al.add(10.02);
		al.add("Steve Jobs");
		al.add("Mark");
		
	int a = (int)al.get(0);
	System.out.println(a);
	}

}
