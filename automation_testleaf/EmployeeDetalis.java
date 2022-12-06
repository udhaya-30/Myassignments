package automation_testleaf;

public class EmployeeDetalis {
	public void printEmployeeName(String empName, int empId)  {
		System.out.println(empName);
		System.out.println(empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetalis employee=new EmployeeDetalis();
		
		employee.printEmployeeName("Udhaya", 07);
		employee.getEmployeeAddress("33/1B,Mamallapuram");
		employee.printEmployeeSalary(250000.010);
		employee.printEmployeeMobileNumber(9080937895L);
		
		
		

	}
	

}
