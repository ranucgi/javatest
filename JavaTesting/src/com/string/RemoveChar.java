package com.string;

public class RemoveChar {
	public static void main(String[] args) {
    char a='Z';
    if(a>123){
    	System.out.println("Hello ranu...");
    }
	//int x=a;
	//System.out.println(x);
	String x="ranu123$%#%$#%";
	removeChar(x.toCharArray());
	}

	private static void removeChar(char x[]) {
		String val="";	
		for(int i=0;i<x.length;i++){
			int z=x[i];
		if(z<65 && z>90 || z<97 && z<122){
			val=val+x[i];
		}
		}
		System.out.println(val);
	}

}
