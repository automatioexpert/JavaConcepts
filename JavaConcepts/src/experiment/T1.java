package experiment;

public class T1 {
	public static void main(String[] args) {

		SingletonTest s1 = SingletonTest.getInstance();

		SingletonTest s2 = SingletonTest.getInstance();

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1 == s2);

	}

}
