package thread;


public class TesteThread extends Thread {
	
	private String nome;
	private int tempo;
	
	public  TesteThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo= tempo;
		start();
       
	}
	public void run() {
	
		try {
		for(int i=0 ; i<10;i++) {
			
			System.out.println(nome + " Contador "+ i);
			
			Thread.sleep(tempo);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("  && TErminou execucao");
	}

}
