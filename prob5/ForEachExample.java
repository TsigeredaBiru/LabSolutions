package lesson8.labs.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;


public class ForEachExample{	
public static void main(String[] args) {
		
		
List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");	

// before java 8
for (String feature : list) {
	  // System.out.println(feature.toUpperCase());
//using lambda	   
list.forEach(n -> System.out.println(n.toUpperCase()));	
//using method reference
list.stream()
	.map(String::toUpperCase)
	.forEach(System.out::println);







// using method reference



}
	
	}
	
	
	
	
}