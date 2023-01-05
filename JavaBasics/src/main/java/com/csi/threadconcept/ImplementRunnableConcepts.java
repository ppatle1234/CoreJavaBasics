package com.csi.threadconcept;

class ImplRunnable implements Runnable
{
	public void run()
	{
		int i;
		for(i = 1; i<= 10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Prashant");
		}
	}

}

public class ImplementRunnableConcepts {
	
	public static void main(String[] args) {
		
		ImplRunnable implRunnable = new ImplRunnable();
		
		Thread thread = new Thread(implRunnable);
		
		thread.start();
	}


}
