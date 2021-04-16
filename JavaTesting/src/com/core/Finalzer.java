package com.core;
class TestCa{
	TestCa (){
		System.out.println("final call...");
	}
	public void finalize(){
		System.out.println("final method call");
	}
}
public class Finalzer {
	public static void main(String[] args) {
		TestCa obj=new TestCa();
		obj=null;
		System.gc();
	}
	

}
