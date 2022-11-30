package automation_testleaf;

public class Car {
	
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("The break is applied.");
	}
	
	public void applyGear() {
		// TODO Auto-generated method stub
		System.out.println("The gear is switched.");
		
	}
	
	public void switchOnAc() {
		// TODO Auto-generated method stub
		System.out.println("The AC is turned on.");

	}
	
	public void applyAccelerater() {
		// TODO Auto-generated method stub
		System.out.println("The speed is accelerated.");
	}
	
		
	
	public static void main(String[] args) {
		
		Car bmw = new Car();
		
		bmw.applyBreak();
		bmw.applyGear();
		bmw.switchOnAc();
		bmw.applyAccelerater();
	}

}
