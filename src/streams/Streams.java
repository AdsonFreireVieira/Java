package streams;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main (String []args) {
		
		List<Integer> asList = Arrays.asList(1,4,6,7,8,2);
		
		String[] strings = {"red","Orange","yellow","green","blue",""};
		
		 System.out.println("======================ORIGINAL===============");
		System.out.println("Strings Original " + Arrays.asList(strings));
       
		System.out.println("===============================================");
        System.out.println("MAIUSCULA "+
        		Arrays.stream(strings)
        		.map(String::toUpperCase)
        		.collect(Collectors.toList()));
        
		
		
		
		asList.stream()
		.filter( e -> e % 2== 0)  // filtra pares 
		.forEach( e -> System.out.print(e)); // percorre lista filtrada com numeros pares
		
		
		asList.stream()
		 // filtros Stream
		.limit(3)  // limita 3 primeiros
		.skip(2)   // ignora os  2 primeiros elementos
		.limit(4)  // pega os 4  primeiros
		.distinct() // nao permite que processe elementos repetidos 
		.map( e -> e *2) // recebe funcoes  nao altera lista original sltera lista se passsar pelo filtro 	
		.forEach( e ->System.out.println(e));
	}
	
	
	

}
