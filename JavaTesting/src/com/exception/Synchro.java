package com.exception;
class CheckSynch{
	public synchronized  void check(int val){
		for(int i=1;i<=5;i++){
			System.out.println(""+i*val);
		}}}
class Synch extends Thread{
	CheckSynch obj;
	int value;
public Synch(CheckSynch obj,int val) {
	this.obj = obj;
	value=val;
}
  public void run(){
	  obj.check(value);
  }}
public class Synchro {
	public static void main(String[] args) {
		CheckSynch obj=new CheckSynch();
		Synch t1=new Synch(obj,5);
		Synch t2=new Synch(obj,3);
		t1.start();
		t2.start();
		
		
		
		
		
	}

}
