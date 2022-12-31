package collectionExamples;

public class AutoBoxing {

	public static void main(String[] args) {
		
		AutoBoxing box = new AutoBoxing();
		System.out.println(box);
		int var =10;
		Integer obj= new Integer("19"); //AutoBoxing 
		int a=obj; //Un wrapping //Auto Unboxing
		Integer b=obj; //Wrapping
		System.out.println(a);
		System.out.println(b);
	}
}
