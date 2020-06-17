package com.basicjava;

class Cab implements Cloneable{
	int x=6;

public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}
public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cab obj=new Cab();
		System.out.println(obj.x);
		Cab ob=obj;
	    Cab c=(Cab)obj.clone();
		 c.x=10;
		System.out.println(obj.x);
	}

}
