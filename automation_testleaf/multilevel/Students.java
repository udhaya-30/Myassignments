package LearnOops;

public class Students extends Department{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Udhaya");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("cs");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("21");
	}
	public static void main(String[] args) {
		Students uk = new Students();
		uk.collegeName();
		uk.collegeCode();
		uk.collegeRank();
		uk.deptName();
		uk.studentName();
		uk.studentDept();
		uk.studentId();
		
	}
}
