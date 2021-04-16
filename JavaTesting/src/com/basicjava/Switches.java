package com.basicjava;
//switch stat direct jump into perticular case: 
// if we not put break condition then default condition always run
//default stat alway be in last 
//if no case match then default can be put at any place,default will run.
//but if any case match and we want default also run 
//then case should be without break condition and default stat alway should be in end 
   // position
//2 cases can not be same, otherwise compile exception
public class Switches {
	public static void main(String[] args) {
		int val=10;
		switch(val){
		case 4:
			System.out.println("val 4");
			break;
		case 20:
			System.out.println("val is 20");
			break;
		case 10:
			System.out.println("val is 10");
		case 7:
			System.out.println("val 7");
			break;
		default:
			System.out.println("no exist....");
			break;
		
		}
	}

}
