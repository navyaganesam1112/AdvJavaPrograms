class Employee{
	int empId;
	String empName;
	double empsalary;
	public Employee(int empId, String empName, double empsalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	
	
}
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp=new Employee(10028,"miss.Navya",5000.00);
       System.out.println(emp);
	}

}
