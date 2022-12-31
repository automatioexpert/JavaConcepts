package multithreadingExample;

public class Home {

	public synchronized void print(String name) {
		System.out.println("Good Morning");
	
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(name );
		
	}
}
