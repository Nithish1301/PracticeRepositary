
public class Employee implements Comparable<Employee>{
private int EmployeeId;
private String EmployeeName;
private String EmployeeDesignation;
private int EmployeeAge;
public Employee(int employeeId, String employeeName, String employeeDesignation, int employeeAge) {
	super();
	EmployeeId = employeeId;
	EmployeeName = employeeName;
	EmployeeDesignation = employeeDesignation;
	EmployeeAge = employeeAge;




}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public String getEmployeeDesignation() {
	return EmployeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	EmployeeDesignation = employeeDesignation;
}
public int getEmployeeAge() {
	return EmployeeAge;
}
public void setEmployeeAge(int employeeAge) {
	EmployeeAge = employeeAge;



}
@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeDesignation="
			+ EmployeeDesignation + ", EmployeeAge=" + EmployeeAge + "]";



}
@Override
public int compareTo(Employee o) {
	
	return this .getEmployeeAge()-o.getEmployeeAge();
}

}
