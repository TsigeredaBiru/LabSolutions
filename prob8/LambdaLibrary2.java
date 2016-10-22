package lesson9.labs.prob8;

import java.util.List;
import java.util.stream.Collectors;

import lesson9.labs.prob7b.TriFunction;

public class LambdaLibrary2 {

	//print a list of sorted full names - all upper case -- of Employees with
	//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
	 		  		
	 public static final TriFunction<List<Employee>, Integer, Character, List<String>> Employeesalary 
		= (emp,salary,name)  -> emp.stream().filter(e ->e.getSalary() >salary).filter(e ->e.getFirstName().charAt(0) < name).map(e->Employee.fullName(e).toUpperCase()).sorted().collect(Collectors.toList());











}
