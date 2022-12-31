package collectionExamples;
import java.util.List;
import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		
		List <String>list = new ArrayList<String>();
		list.add("Steve Jobs");
		list.add("Bill Gates");
		list.add("Mark Zukerberg");
		
		list.add("Sunder Pichai");
		list.add(null);
		System.out.println(list);
		
	//	[Steve Jobs, Bill Gates, Mark Zukerberg, Sunder Pichai]

		//[Steve Jobs, Bill Gates, Mark Zukerberg]
		
	}
}
