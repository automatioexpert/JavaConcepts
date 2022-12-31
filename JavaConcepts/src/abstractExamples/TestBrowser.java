package abstractExamples;

public class TestBrowser {

	public static void main(String[] args) {
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.click();
		driver.sendKeys();
		driver.captureScreenshot();
		System.out.println("Test case is passed");
	}
}
