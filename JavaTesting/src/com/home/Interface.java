package com.home;

interface C{
	int i=10;
	 void a();
}
interface D{
	int i=20;
	void a();
}
class Y implements C,D{
@Override
	public void a() {
		System.out.println("hello");
}
	}
public class Interface {
	public static void main(String[] args) {
		Y obj=new Y();
		obj.a();
	}
}

