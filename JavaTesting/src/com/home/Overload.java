package com.home;

class A{
	 A(){
		 System.out.println("A class");
	 }
	
}
class B extends A{
	B(){
		 System.out.println("B class");
	 }
}
class X extends B{
		X(){
			 System.out.println("X class");
		 }
		
}
public class Overload {
	public static void main(String[] args) {
		X obj=new X();
	}

}
