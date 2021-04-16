package com.home;

abstract class Abst{
	 int i=7;
	public void getData(){
		System.out.println("hello Abst");
		}
	abstract void display();
}

class NonAbst extends Abst{
	int i=10;
   @Override
	void display() {
		System.out.println("child class");
		}
}
public class E {
	public static void main(String[] args) {
		Abst ob=new NonAbst();
		System.out.println(ob.i);
	}

}
