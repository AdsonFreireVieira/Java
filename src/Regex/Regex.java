package Regex;

public class Regex {
	
	public static void main(String [] args) {
		
		String firstString = "this sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		
		
		System.out.println("Original String  1: %s%n" + firstString);
		
		//Substitui * por ^
		
		//firstString = firstString.replaceAll("\\*", "^");
		//System.out.printf("^ substituido por  * " + firstString);
		
		firstString = firstString.replaceFirst("stars", "carets");
		System.out.printf("\"carets\" substituido for \"stars\" : %s%n", firstString);
		
	}

}
