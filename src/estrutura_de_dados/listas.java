package estrutura_de_dados;

import java.util.ArrayList;
import java.util.List;

public class listas {
 
	public static void main(String [] args){
		
		listObjeto obj = new listObjeto();
		List<listObjeto> lista = new ArrayList<>();
		
		obj.setNome("mari");
	    obj.setIdade(12);
	    obj.setEmail("@gmail");
	    
		lista.add(obj);
		
		for (listObjeto  lobj: lista) {
			
			
			if(lobj.getNome().equalsIgnoreCase("Mari"))
			{System.out.println("Amor do Papai");}
			System.out.println(lobj.toString());
		}
	}
	

}
