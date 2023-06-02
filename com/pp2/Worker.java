package com.pp2;

//Creacion de la clase worker implementando de la interfaz Runnable
public class Worker implements Runnable{
	private boolean isTerminated=false;
	
	public void run() {
		while(!isTerminated) {
			System.out.println("Hello from worker class...");
		}
		
		try {
			//sleep() manda un tiempo de espera para volver a ejecutarse
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isTerminated() {
		return isTerminated;
	}
	
	public void setTerminated(boolean isTerminated) {
		this.isTerminated=isTerminated;
	}
}
