import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmployeeName().compareTo(o1.getEmployeeName());
	}	
}

public class CollectionsDemo {

	public static void main(String[] args) {
		/*ArrayList arr=new ArrayList();
		arr.add("nithish");
		arr.add(123);
		arr.add(12.3);
		arr.add(12.45);
		System.out.println(arr);
		//Iterator itr=arr.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		System.out.println(arr.contains("nithish"));

		for (Object arr1 : arr) {
			System.out.println(arr1);
		}
		arr.stream().forEach((t) ->System.out.println(t) );
		SortByName sort=new SortByName();
		ArrayList<Employee> Emp=new ArrayList<Employee>();
		Emp.add(new Employee(12, "Nithish", "Trainee", 22));
		Emp.add(new Employee(11, "Mugesh", "Trainee", 22));
		Emp.add(new Employee(10, "Raj", "Trainee", 22));
		Emp.add(new Employee(8, "Karthi", "Trainee", 22));
		Emp.add(new Employee(6, "Eshwar", "Trainee", 22));
		
		
		Collections.sort(Emp, sort);
		Emp.stream().forEach(em-> System.out.println(em));*/
		
		TreeSet<Employee> tEmp=new TreeSet<Employee>();
		tEmp.add(new Employee(12, "Vishwa", "Trainee", 21));
		tEmp.add(new Employee(11, "Mugesh", "Trainee", 22));
		tEmp.add(new Employee(10, "Raj", "Trainee", 28));
		tEmp.add(new Employee(8, "Eshwar", "Trainee", 24));
		tEmp.add(new Employee(6, "Saran", "Trainee", 25));
		
		tEmp.stream().forEach((temp)->System.out.println(temp));
		
		
		TreeSet<Employee> Tmp=new TreeSet<Employee>((Employee o1,Employee o2)->{
			
			return o2.getEmployeeName().compareTo(o1.getEmployeeName());
		});
		
		Tmp.add(new Employee(12, "Vishwa", "Trainee", 21));
		Tmp.add(new Employee(11, "Mugesh", "Trainee", 22));
		Tmp.add(new Employee(10, "Raj", "Trainee", 22));
		Tmp.add(new Employee(8, "Saran", "Trainee", 24));
		Tmp.add(new Employee(6, "Eshwar", "Trainee", 25));
		
		System.out.println("=========================Compare======================");
		Tmp.stream().forEach((t)->System.out.println(t));
		
		
		
		List<String> names = Arrays.asList("Dhoni","Jaddu","Raina","Bravo","Santner");
		names.stream().filter(t->t.startsWith("J")).forEach(t->System.out.println(t));
		
		Tmp.stream().filter(t->t.getEmployeeAge()==22).map( Employee::getEmployeeName ).forEach(t->System.out.println(t));
	}
	
	

}
