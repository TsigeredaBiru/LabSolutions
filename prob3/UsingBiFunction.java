package lesson8.labs.prob3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class UsingBiFunction {
	

	
	private static BiFunction<Double, Double, List<Double>> listadd = 
			(x, y) -> {
				List<Double> list = new ArrayList<Double>();
				list.add(Math.pow(x, y));
				list.add(x * y);
				return list;
			};
	
	
	public static void main(String[] args) {
		
		List<Double> list = listadd.apply(2.0, 3.0);
		
		System.out.println(list);
	}
	
}
