
public class Employee {
	int EmployeeId;
	String EmployeeName;
	int EmployeeSalary;
	char active;
	
	

	public Employee(int employeeId, String employeeName, int employeeSalary, char active) {
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.EmployeeSalary = employeeSalary;
		this.active = active;
	}



	public void DisplayDetails(){
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);
		System.out.println(EmployeeSalary);
		System.out.println(active);

		
	}

}
