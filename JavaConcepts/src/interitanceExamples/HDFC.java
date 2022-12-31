package interitanceExamples;

public class HDFC extends RBI {

	@Override
	public double getHomeLoanROI() {
		return 10.5;
	}
	
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		System.out.println(hdfc.getHomeLoanROI());
		System.out.println(hdfc.getCarLoanROI());

	}
}
