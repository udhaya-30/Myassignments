package automation_testleaf;

public class Mobile {
	String mobileBrandName = "Apple";
	char mobileLogo = 'i';
	short noOfMobilePiece = 1;
	int modelNumber = 14;
	long mobileImeiNumber = 793592456712L;
	float mobilePrice = 149999.99f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
		Mobile phone = new Mobile();
		
		System.out.println("The mobile brand name is " + phone.mobileBrandName);
		System.out.println("The mobile logo is " + phone.mobileLogo);
		System.out.println("The Number of mobile pieces is " + phone.noOfMobilePiece);
		System.out.println("The mobile model number is " + phone.modelNumber);
		System.out.println("The mobile IMEI number  is " + phone.mobileImeiNumber);
		System.out.println("The mobile price is " + phone.mobilePrice);
		System.out.println("Whether the mobile is damaged  " + phone.isDamaged);






		
	}

}
