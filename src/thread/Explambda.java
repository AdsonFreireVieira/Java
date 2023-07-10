package thread;

public class Explambda {
	
 
	public static void main(String []args) {
		
	  //Lambda
		new Thread( () -> System.out.println(" Teste Threads")).run();
	}

}
