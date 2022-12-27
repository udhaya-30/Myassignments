package LearnOops;

public class AxisBank extends Bankinginfo{

	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("overrided Deposite");
	}
	
	public static void main(String[] args) {
		
		AxisBank override = new AxisBank();
		override.deposite();
	}
}
