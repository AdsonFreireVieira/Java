package tokenTest;

import java.util.Scanner;

public class tokenTest {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Frase");
		
		String fr = scanner.nextLine();
		
    
		String [] tokens = fr.split("");
		
		System.out.println("Quantidade Letras   " + tokens.length);
		
		for(String token: tokens) {
			System.out.print(token);
		}
	}

}
