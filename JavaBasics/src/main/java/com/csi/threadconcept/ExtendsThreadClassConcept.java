package com.csi.threadconcept;

class ExtendThreadClass extends Thread
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

public class ExtendsThreadClassConcept {
	
	public static void main(String[] args) {
		ExtendThreadClass extendThreadClass = new ExtendThreadClass();
		
		extendThreadClass.start();
	}
}

