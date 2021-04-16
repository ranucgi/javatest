package com.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionA {
	public static void main(String[] args) throws InterruptedException{
		ExecutorService ex=Executors.newFixedThreadPool(3);
		for(int i=1;i<=10;i++){
			Runnable obj=new MyRunable(i+"");
			ex.execute(obj);
		}
		ex.shutdown();
	}
}

