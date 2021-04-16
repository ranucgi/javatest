package com.design;

public class MainMethod {
	public static void main(String[] args) {
		FactoryCreate obj=new FactoryCreate();
        Bank bank=obj.objectCreate("SBI");
        bank.getInterest();
         System.out.println(bank.getInterest(1000));
			
	}

}
