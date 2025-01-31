package e.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//A company has a list of employees with their salaries. You need to filter employees who 
//earn more than 50,000, sort them in descending order of salary, and collect the names.

//Input:
//List<Employee> employees = List.of(
//	    new Employee("Alice", 45000),
//	    new Employee("Bob", 55000),
//	    new Employee("Charlie", 60000),
//	    new Employee("David", 40000),
//	    new Employee("Eve", 75000)
//	);

//Output:
//	[Eve, Charlie, Bob]

public class SalaryFilter {

	public static void main(String[] args) {
		List<Employee> employees = List.of(
			    new Employee("Alice", 45000),
			    new Employee("Bob", 55000),
			    new Employee("Charlie", 60000),
			    new Employee("David", 40000),
			    new Employee("Eve", 75000)
			);
		printAnswer(employees);
	}

	private static void printAnswer(List<Employee> employees) {
		List<String>employeeNames = employees.stream().filter(emp->emp.getSalary()>50000)
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).map(emp->emp.getName()).collect(Collectors.toList());
	
	System.out.println(employeeNames);}

}
