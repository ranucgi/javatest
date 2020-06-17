package com.thread;

class Multiplication{
	public  void matrix(int x) {
		System.out.println("ssdsj");
		synchronized(this){
		for(int i=1;i<=5;i++){
			try {
				System.out.println(x*i);
				Thread.sleep(10);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
	}
	public void displaydata(String name){
		System.out.println("ds;fls,fd..............."+name);
	}
}

class MultiF extends Thread{
	Multiplication object;
	int val;
    public MultiF(int val, Multiplication obj) {
    	object=obj;
    	this.val=val;
    }
    public void run(){
    	object.matrix(val);
    	object.displaydata(Thread.currentThread().getName());   	
    }
	
}

public class SynchronizationImpl {
	public static void main(String[] args) {
		Multiplication obj=new Multiplication();
	    MultiF ob1=new MultiF(5,obj);
		MultiF ob2=new MultiF(2,obj);
		ob1.start();
		ob2.start();
	}

}
