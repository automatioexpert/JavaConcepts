package multithreadingExample;

public class Demo {
	public static void main(String[] args) {
		MyThreadUsingRunnable obj = new MyThreadUsingRunnable();

		Thread t1 = new Thread(obj);
		t1.setName("VV Automation Expert");
		t1.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread : " + Thread.currentThread().getName());

		}
	}

}
