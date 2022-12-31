package interitanceExamples;

public class HSBC extends RBI {

	@Override
	public double getHomeLoanROI() {
		
		return 20.5;
	}
	public static void main(String[] args) {
		
		HSBC hsbc = new HSBC();
		System.out.println(hsbc.getHomeLoanROI());
	}
}
