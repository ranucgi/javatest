package com.exception;
class DaemonC extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i);
		try{
			 Thread.sleep(1);
		  } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}}
public class Daemon {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		DaemonC obj=new DaemonC();
		obj.setDaemon(true);
		obj.start();
		System.out.println("end main...........");
	}

}
