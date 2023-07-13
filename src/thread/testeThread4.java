package thread;

public class testeThread4 {

	public static void main (String [] args) {


		ThreadRunnable thread1 = new ThreadRunnable("#Thread 1", 300);
		ThreadRunnable thread2 = new ThreadRunnable("#Thread 2",600);
		ThreadRunnable thread3 = new ThreadRunnable("#Thread 3",1000);

		Thread  t1= new Thread(thread1);
		Thread t2= new Thread(thread2);
		Thread t3= new Thread(thread3);

		 t1.setPriority(5);
		 
		 t2.setPriority(8);
		 
		 t3.setPriority(2);
		 
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		
		
	} 

}
