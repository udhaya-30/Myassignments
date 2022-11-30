package automation_testleaf;

public class TwoWheelers {
	
	int noOfWheels = 2;
	short noOfMirrors=2;
	long chassisNumber=137926996626L;
	boolean isPunctured=false;
	String bikeName="rx100";
	double runningKM=5672.124;

	    public static void main(String[] args) {
	        TwoWheelers bike = new TwoWheelers();
	       System.out.println("Number of wheels = " + bike.noOfWheels);
	        System.out.println("Number of mirrors = " + bike.noOfMirrors);
	        System.out.println("Bike Chasis Number = " + bike.chassisNumber);
	        System.out.println("Whether the bike is punctured" + bike.isPunctured);
	        System.out.println("The bike name is " + bike.bikeName);
	        System.out.println("Bike runnning KM is " + bike.runningKM);
	    }

}
