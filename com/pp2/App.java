package com.pp2;

public class App {

	public static void main(String[] args) {
		
		/*Dreacion de los objetos 
		 * worker y t1
		 */
		Worker worker = new Worker();
		Thread t1 = new Thread(worker);
		t1.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		/*true ayuda a dar por finalizado el bucle luego
		 * de un tiempo, de ser falso el bucle jamas acabaria
		 */
		worker.setTerminated(true);
		System.out.println("Finished...");
	
	}

}
