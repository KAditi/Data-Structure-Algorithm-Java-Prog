package com.example.deadlock.detection;

public class DeadlockDetect {
	
	String str1 = "Aditi";
	String str2 = "Kartiki";
	
	Thread thread1 = new Thread("FirstThread"){
			
			public void run()
			{
				while(true)
				{
					synchronized (str1) {
						synchronized (str2) {
							System.out.println("Concat"+(str1+str2));
						}
						
					}
				}
			}
		};
		
		Thread thread2 = new Thread("Second Thread")
		{
			public void run()
			{
				while(true)
				{
					synchronized (str2) {
						synchronized (str1) {
							System.out.println("Concat"+(str2+str1));
							
						}
					}
				}
			}
		};
	
	
	public static void main(String[] args) {
		DeadlockDetect deadLock = new DeadlockDetect();
		deadLock.thread1.start();
		deadLock.thread2.start();
	}

}
