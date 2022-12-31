package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("steve");
		hash.add("mark");
		hash.add("simon");
		System.out.println(hash);

		/*
		 * for(int i=0;i<hash.size();i++) 
		 * { System.out.println(hash.get); }
		 */
		
		for(String var:hash) {
			System.out.println(var);
		}
	
		Iterator<String> itr=hash.iterator();
		
		while(itr.hasNext()) {
			Object a=itr.next();
			System.out.println(a);
		}
		
		
		
		
	}

}
