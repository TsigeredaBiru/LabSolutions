package lesson9.labs.prob8;

import java.util.List;
import lesson9.labs.prob7b.TriFunction;

public class LambdaLibrary {
	 

	//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'
		
		 public static final TriFunction<List<Employee>, Integer, Character, Long> Employeesalary 
		  		= (emp,salary,name)  -> emp.stream().filter(e ->e.getSalary() >salary).filter(e ->e.getLastName().charAt(0) > name).map(e->Employee.fullName(e)).count();
		  		     	
		  	
	 		     	
		  			
	  		
	 
}
