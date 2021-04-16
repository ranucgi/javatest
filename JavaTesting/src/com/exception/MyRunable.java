package com.exception;

public class MyRunable  implements Runnable {
    String name;
	
	public MyRunable(String ob) {
		name=ob;
	}

	public void run() {
		System.out.println("start thread "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end thread...... "+name);
	}

}
