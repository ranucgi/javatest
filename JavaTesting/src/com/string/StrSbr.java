package com.string;

public class StrSbr {
	public static void main(String[] args) {
		String s="ranu";
		/*String s1=new String("ranu");
		String s2=new String("ranu");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s));
		System.out.println(s1==s);*/
		System.out.println(".......................");
		String s1=new String("ranu");
		StringBuffer br1=new StringBuffer("ranu");
		StringBuffer br2=new StringBuffer("ranu");
		System.out.println(br1==br2);
		System.out.println(br1.equals(br2));
		System.out.println(s.equals(br1));
		System.out.println(".........................");
		System.out.println(br1.equals(s1));
	}

}
