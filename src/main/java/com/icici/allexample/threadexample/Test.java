package com.icici.allexample.threadexample;

public class Test {

	public static void main(String[] args) {

		
	System.out.println(Thread.currentThread().getName());
 MyThread myThread = new MyThread();
	System.out.println(myThread.getName());
myThread.start();
System.out.println(Thread.currentThread().getName());

	}

}
