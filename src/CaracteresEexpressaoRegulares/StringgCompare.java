package CaracteresEexpressaoRegulares;

public class StringgCompare {
	
	public static void main(String [] args) {
		
		String s1 = new String("hello");
		String s2 = "goodbye";
	    String s3 = "Happy Birthday";
	    String s4 = "happy birthday";
	    
	    if(s1.equals("hello")) {
	    	System.out.println("S1 , Iguais com  equals");
	    } else {
	    	System.out.println("Diferente");
	    }
	 
	    if(s1 == "hello") {
	    	System.out.println("Iguais com ==");
	    }else {
	    	System.out.println("Diferente ==");
	    }
	    
	    
	    if(s3.equalsIgnoreCase(s4)) {
	    	System.out.println("IGUAIS ignorando maisculas");
	    }
	    else {
	        System.out.println("diferentes  ignire case");
	    }
	    
	    System.out.printf("compare" + s1.compareTo(s2));
	    System.out.printf("compare" + s2.compareTo(s1));
	    System.out.printf("compare" + s1.compareTo(s1));
	    System.out.printf("compare" + s3.compareTo(s4));
	    System.out.printf("compare" + s4.compareTo(s3));

    
	    System.out.println("REgion  Matches==================");
	    
	    // Ditingue maiuscula  de minusculas
	    if(s3.regionMatches(0, s4, 0, 5)) {
	    	
	    	System.out.println("Primeiras 5 of s3 and s4 match");
	    }
	    
	    //ignira  maiusculas de minidculas
       if(s3.regionMatches(true, 0, s4, 0, 5)) {
    	   
       }
	}
}
	

}
