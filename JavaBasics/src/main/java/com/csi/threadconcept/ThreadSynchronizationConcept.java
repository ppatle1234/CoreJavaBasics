package com.csi.threadconcept;

class Table
{
	synchronized void printTable(int n)
	{
		int i;
		for(i = 1; i<= 5; i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(i * n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}

class MyThread1 extends Thread
{
	Table t;
	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(5);
	}
	
}

class MyThread2 extends Thread
{
    Table t;
	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(10);
	}
	
}

class MyThread3 extends Thread
{
	Table t;
	public MyThread3(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(15);
	}
}

class MyThread4 extends Thread
{
	Table t;
	public MyThread4(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(20);
	}
}

public class ThreadSynchronizationConcept {
	
	public static void main(String[] args) {
		
		Table table = new Table();
		
		MyThread1 myThread1 = new MyThread1(table);
		MyThread2 myThread2 = new MyThread2(table);
		MyThread3 myThread3 = new MyThread3(table);
		MyThread4 myThread4 = new MyThread4(table);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		
	}

}
