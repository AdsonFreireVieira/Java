package estrutura_de_dados.Pilha;

public class Pilha {
	
	
	public static void main(String [] args) {
		
		Object o;
		
		ArrayStack<Integer> A = new ArrayStack<Integer>();
		
		A.status("new Array <Integer> A"  , null);
		A.push(7);
		A.status("A.push(7)", null);
	    A.push(2);
	    A.push(3);
	    A.status(" nullll", A);
	    A.pop();
 	    A.status("", A);
        o=A.top();
        A.status(null, o);
        A.pop();
        A.status(null, A);
      
	}

}
