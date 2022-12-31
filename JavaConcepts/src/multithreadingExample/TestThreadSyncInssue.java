package multithreadingExample;

public class TestThreadSyncInssue {
	public static void main(String[] args) {
		Home h = new Home();
		
		ABC t1 = new ABC(h, "ste");
		t1.start();
		t1.i=10;
		System.out.println("===============");
		ABC t2 = new ABC(h, "ste");
		t2.start();
		System.out.println("Value of i is : "+t2.i);
		
	}

}
