package Regex;

import java.util.Arrays;

public class Regex {

	public static void main(String[] args) {

		String firstString = "this sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

		System.out.println("Original String  1: %s%n" + firstString);

		// Substitui * por ^

		 firstString = firstString.replaceAll("\\*", "^");
		 System.out.printf("^ substituido por * " + firstString);

		firstString = firstString.replaceFirst("stars", "carets");
		 System.out.printf("\"carets\" substituido for \"stars\" : %s%n",
		 firstString);

		System.out.printf("Every word repalce by \"word\":%s%n%n", firstString.replaceAll("\\w+", "word"));

		for (int i = 0; i < 3; i++) {

			secondString = secondString.replaceFirst("\\d", "digit");

			System.out.printf("First 3 digits replace by  \"Digit\" : %s%n", secondString);

			System.out.println("String Splits a commas");

			String[] results = secondString.split(",\\s*");
			System.out.println(Arrays.toString(results));

		}
	}

}
