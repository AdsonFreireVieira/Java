package estrutura_de_dados.Pilha;

public interface  Stack<E>{

	public int size();

	public  boolean isEmpty();
	 
	public  E top() 
		throws EmptyStackException;
	
	
	public void push (E elemento);
	
	public E pop() 
		throws EmptyStackException;
}
