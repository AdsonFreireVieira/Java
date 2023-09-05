package estrutura_de_dados.Pilha;

public class Pilha {
	
	
	public static void main(String [] args) {
		
		Object o;
		
		ArrayStack<Integer> A = new ArrayStack<Integer>();
		
		A.status(" new ArrayStack<Integer> A " , null);
		A.push(8);
		A.status("A.push(7) " , null);
	
	}

}
