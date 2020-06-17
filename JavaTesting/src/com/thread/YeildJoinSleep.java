package com.thread;
//join -give a chance to child thread..
//yeild- stop for running current thread.
class MultiE extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			//Thread.yield();
			System.out.println(i);
		}
	}
	
}

public class YeildJoinSleep {
	public static void main(String[] args) throws InterruptedException {
		MultiE obj=new MultiE();
		obj.start();
		//obj.join();
		for(int i=6;i<=10;i++){
			//Thread.sleep(1);
			System.out.println(i);
		}
	}

}
