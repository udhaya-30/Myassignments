package automation_testleaf;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		   int[] num= {11,12,11,21,88,21,88};
		   for(int i=0;i < num.length;i++)
		   {
			   for(int j=i+1;j< num.length;j++)
			   {
				   if(num[i]==num[j])
				   {
					   System.out.println(num[i]);
				   }
			   }
				   
			   }
		   }

}
