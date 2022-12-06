package automation_testleaf;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num=in.nextInt();
		
		if(num>0) 
			System.out.println("Positive Number");
			
		else 
			System.out.println("Negative Number");

}
}
