package streams;

import java.util.Arrays;
import java.util.List;

public class Streams {
	
	public static void main (String []args) {
		
		List<Integer> asList = Arrays.asList(1,4,6,7,8,2);
		
		asList.stream()
		.filter( e -> e % 2== 0)
		.forEach( e -> System.out.print(e));
	}
}
