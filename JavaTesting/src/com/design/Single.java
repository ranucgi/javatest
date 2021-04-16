package com.design;
class Singleton{
	private static Singleton obj;
	private Singleton(){
		System.out.println("hello");
	}
	public static Singleton getInt(){
		if(obj==null){
			obj=new Singleton();
		}
		return obj;
	}}
public class Single {
	public static void main(String[] args) {
		Singleton obj=Singleton.getInt();
		Singleton ob1=Singleton.getInt();
	}

}
