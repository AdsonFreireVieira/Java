package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	
	public static void main(String [] args) {
		
		
		//BUsca  regex
		// \d = procura todos os digitos
		// \D = tudo que nao for digito
		// \s\t\f = representa espacos erm branco
		// \S = todos caracteres excluind os brancos
		// \w = a-Z ou A -Z digitos _
		// \W = tudo que nao for \w
		String  regex = "\\w";
		String palavra2 = "kasdkd@ d12+3ks\td#m34_5smw23";
	
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher =  pattern.matcher(palavra2);
		
		System.out.println("Regex " + palavra2);
		System.out.println("PAlavra2  "+ regex);
		
			while(matcher.find()) {
				//  pega posicao System.out.print(matcher.start()+"  ");
				                          // mather.start(); Busca Posicao
				                          // matcher.group() + agrupa os elementos capturados
			     System.out.println(matcher.start()+" " + matcher.group()+ "  ");
	}

}
}