package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) throws IOException {
		 Scanner sc=new Scanner(System.in);
		 System.out.println(sc.next()); //print only first word 
		 System.out.println(sc.nextLine());//print whole line
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 String s= br.readLine();
		 System.out.println(s);
	}

}
