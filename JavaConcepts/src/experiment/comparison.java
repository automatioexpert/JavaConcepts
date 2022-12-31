package experiment;

public class comparison {
	public static void main(String[] args) {

		String s1 = "GOD";
		String s2 = "GOD";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("===============");
		
		String str1=new String("GOD");
		String str2= new String("GOD");
		
		System.out.println(str1==str2);
		
		//== operator is mainly for reference comparison
		//.equals() method is used for content comparison
		
		
	
	}

}
