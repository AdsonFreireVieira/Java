package thread;


public class Threads {
	
	public static void main(String []args) {
		
     //  TesteThread thread = new TesteThread("thread #1", 800);
       
     //TesteThread thread2 = new TesteThread("thread #2",1500);
     
		ThreadRunnable thread1 = new ThreadRunnable("Thread 1",500);
		
		ThreadRunnable thread2 = new ThreadRunnable("Thread 2",1000);
		
		ThreadRunnable thread3 = new ThreadRunnable("Thread 3",1500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		 
		t1.start();
		t2.start();
		t3.start();


		
	    //Thread t1= new Thread(thread1);
	   // t1.start();
	}

}
