package stringToken;

import java.util.Scanner;


public class SToken {

	
	public static void main(String [] args) {
		
		//obtem frase
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite Frase");
		
		 String frase = teclado.nextLine();
		 
		 String[] tokens = frase.split(" ");
		 
		 System.out.println("Numeros Elementos: %d%n  tokens %n" + tokens.length);
		 
		 for(String token : tokens) {
			 
			 System.out.println(token);
		 }
	}
}
