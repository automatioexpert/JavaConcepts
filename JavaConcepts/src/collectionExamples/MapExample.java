package collectionExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("firstName", "Valmiki");
		map.put("firstName", "VV");
		map.put("lastName", "Vishwakarma");
		map.put("subject", "Selenium");

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("firstName"));

		Set<String> key = map.keySet();
		for (String k : key) {

			System.out.println("Key : " + key + " value: " + map.get(k));
		}

		Map<String, List<String>> map1 = new HashMap<String, List<String>>();

		List<String> listOfEmails = new ArrayList<String>();
		listOfEmails.add("abct@gna.com");
		listOfEmails.add("ab239293ct@gna.com");
		listOfEmails.add("abct834973@gna.com");
		map1.put("email", listOfEmails);
		 

	}
}
