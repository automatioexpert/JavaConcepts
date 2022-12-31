package multithreadingExample;

public class Test extends Thread {

	/*
	 * We can implement MultiThread in 2 ways: 1. By extending Thread class 2.
	 * Implement Runnable interface
	 * 
	 * 
	 * 
	 */

	@Override
	public void run() {

		for(int i=1; i<=10;i++) {
			System.out.println("Child Thread");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
