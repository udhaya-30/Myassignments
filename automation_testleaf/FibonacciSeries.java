package automation_testleaf;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the range for fibonacci series :");
		
		int range = in.nextInt();
		for(int i=1;i<=range;i++) {
			System.out.print(a+" ");
			sum=a+b;
		    a=b;
			b=sum;
			
		}


}
}
