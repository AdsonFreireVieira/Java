package estrutura_de_dados.Pilha;

public class ArrayStack<E> implements Stack<E> {

	protected int capacidade;
	public static final int CAPACIDADE = 1000;
	protected int top = -1;
	protected E S[];

	public ArrayStack() {
		this(CAPACIDADE);
	}

	public ArrayStack(int cap) {
		capacidade = cap;
		S = (E[]) new Object[capacidade];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (top + 1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top < 1);
	}

	@Override
	public E top() throws EmptyStackException {

		if (isEmpty()) {

			throw new EmptyStackException(" Stack isEmpty");
		}
		return S[top];
	}

	@Override
	public void push(E elemento) {
		if (size() == capacidade) 

			System.out.println("Pilha Cheia ");
		
		S[++top] = elemento;

	}

	@Override
	public E pop() throws EmptyStackException {

		E element;

		if (isEmpty())

			throw new EmptyStackException("Stack is Empty");
		element = S[top];

		S[top--] = null;

		return element;
	}

	@Override
	public String toString() {
		String s;

		s = "[";
		if (size() > 0)
			s += S[0];
		if (size() > 1)
			for (int i = 1; i <= size(); i++) {
				s += ", " + S[i];
			}

		return s + "]";
	}
	
	public void status(String  op,Object element) {
		
		System.out.println("-------------> "+ op);
		System.out.println(", returns " + element);
	    System.out.println("result  :Size" + size() + " , isEmpty = " + isEmpty());
	    System.out.println(" , Stack : " +  this);   
	}

}





