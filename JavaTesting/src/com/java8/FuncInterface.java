package com.java8;
 interface Func{
	void show(int x);
 }
 /*class FuncIm implements Func{
	 public void show(int x){
		 System.out.println("welcomeeeeeeeeee");
	 }
 }*/
public interface FuncInterface {
	public static void main(String[] args) {
	/*	Func o=new FuncIm();
		o.show(5);
	}*/
		/*Func obj=new Func(){
			public void show(int x){
				System.out.println("annonymous....."+x);
			}
		};obj.show(7);*/
		Func obj=(int x)->{ x=x*x;
			  
				System.out.println("annonymous.....with Lambda...."+x);
			
		};obj.show(8);
	}
}
