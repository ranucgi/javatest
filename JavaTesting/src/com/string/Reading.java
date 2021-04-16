package com.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//file read and write
public class Reading {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Dell\\Desktop\\files.txt");
		//File file=new File("D:\\files\\a.txt");
		BufferedReader b=new BufferedReader(new FileReader(file));
		String s = null;
		while((s=b.readLine())!=null)
			System.out.println(s);
		
		BufferedWriter wr=new BufferedWriter(new FileWriter(file));
		wr.write("ranu patel");
		wr.flush();
		
		
		
		
	}
	

}
