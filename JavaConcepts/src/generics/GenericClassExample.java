package generics;

public class GenericClassExample<T extends Number> {

	T ob;

	public GenericClassExample(T ob) {

		this.ob = ob;
	}

	public void show() {

		System.out.println("Type of object is : " + ob.getClass().getName());

	}
	
	public T get() {
		return this.ob;
	}

}
