package com.exception;
class MyThreadB  extends Thread{
   int sum=0;
 public void run(){
	 synchronized(this){
		 for(int i=1;i<=5;i++){
				sum=sum+i;
				}this.notify();
	 }
  }
}
public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		
		MyThreadB obj=new MyThreadB();
		obj.start();
		synchronized(obj){
			Thread.sleep(1000);
			obj.wait();
		}
		System.out.println("total sum"+obj.sum);
		
	}

}
