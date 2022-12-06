package automation_testleaf;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number :");
     
       int fact = 1;
       for ( int i=in.nextInt(); i >=1; i--) {
		fact=fact*i;
	}
       System.out.println("The Factorial of the number is "+fact);
	}
}
