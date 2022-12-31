package abstractExamples;

public class FirefoxDriver extends WebDriver {

	@Override
	public void click() {
		System.out.println("Mozilla firefox click");

	}

	@Override
	public void sendKeys() {
		System.out.println("FF sendKeys");

	}

	@Override
	public void get(String url) {

		System.out.println("Chrome launch url : " + url);
	}

	public void captureScreenshot() {
		System.out.println("Capturing screenshot");
	
	}
}
