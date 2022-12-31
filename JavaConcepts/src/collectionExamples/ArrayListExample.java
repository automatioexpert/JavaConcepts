package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(19);
		list.add(true);
		list.add(19.29);
		list.add("Steve");
		list.add(21.34);
		list.add(null);
		list.add('A');
		System.out.println(list); //Insertion order is preserved
		
	//How to fetch values from list
	/*
	 * for (Object l:list) { System.out.println(l); }
	 * System.out.println("==============="); //Using for loop for(int
	 * i=0;i<list.size();i++) { System.out.println(list.get(i)); }
	 */
		
		//System.out.println(list.get(10));
		
		int var=(Integer)list.get(0);
		 double d= (double)list.get(-1);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
