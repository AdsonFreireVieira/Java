package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams1 {
	
	public static void main(String []args) {
	String[] strings= {"Red","Orange","Yellow","Green","Blue","Violeta"};
	
	System.out.println(menorReversed(strings));
	
	}
	
	public static List<String> Menor(String [] list){
		
		//  sem distincao em ordem crescente
	 return Arrays.stream(list)
		.filter(s -> s.compareToIgnoreCase("m")<0)  // menores que m
		.sorted(String.CASE_INSENSITIVE_ORDER)
		.collect(Collectors.toList());
		
		
	}
	
	public static List<String> menorReversed(String []  list){
  
		 return Arrays.stream(list)
				.filter(s  -> s.compareToIgnoreCase("Z")<0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toList());
			
		
	}

}
