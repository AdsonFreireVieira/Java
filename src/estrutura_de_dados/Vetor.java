package estrutura_de_dados;

public class Vetor {

	public static void main(String []args) {
		
		String palavra [] = {"pera","uva","Banana","maca"};
		
		int numeros [] = {6,23,63,8,9,1,8,72};
		
		
		 System.out.println("=================Strings==========================");
		for (String st: palavra) {
		
			System.out.println(st.toUpperCase());
			
		
			
		}
		 
		System.out.println(palavra.length);
		System.out.println(palavra.hashCode());
		System.out.println("=====================================================");
		
		
		System.out.println("=================================int==============");
		
		
	}
}
