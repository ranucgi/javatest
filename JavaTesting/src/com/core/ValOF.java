package com.core;

public class ValOF {
	public static void main(String[] args) {
		Integer o=Integer.valueOf(1);
		System.out.println(o);
		Integer a = new Integer(1);
		Integer b = new Integer(1);
         System.out.println("a==b? " + (a==b));
		 

		 int  c = Integer.valueOf(127);
		 int d = Integer.valueOf("127");

		 System.out.println("c==d? " + (c==d)); 

		 Integer e = Integer.valueOf(128);
		 Integer f = Integer.valueOf(128);
		 System.out.println("e==f? " + (e==f));
		 
		 System.out.println(Integer.valueOf('a'));
				 

		 
		
	}

}
