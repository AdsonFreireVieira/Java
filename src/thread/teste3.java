package thread;

public class teste3 {

	public static void main(String []args) {
		
	    
	     
			ThreadRunnable thread1 = new ThreadRunnable("Thread 1",500);
			
			ThreadRunnable thread2 = new ThreadRunnable("Thread 2",1000);
			
			ThreadRunnable thread3 = new ThreadRunnable("Thread 3",1500);
			
			Thread t1 = new Thread(thread1);
			Thread t2 = new Thread(thread2);
			Thread t3 = new Thread(thread3);
			 
			t1.start();
			t2.start();
			t3.start();
			
			try {
				t1.join();
				t2.join();
				t3.join();

			}catch(Exception e){

				e.printStackTrace();
			}
			System.out.println("Programa Finalizou");

	}

}

