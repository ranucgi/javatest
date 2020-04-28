package com.java8;
//annonymous inner class i. e the class without name...
class Anum{
	public void show(){
		System.out.println("welcome before change.....");
	}
}

public class Annonymouss {
	public static void main(String[] args) {
		Anum obj=new Anum(){
			public void show(){
				System.out.println("welcome after...........");
			}
		};obj.show();
	}

}
