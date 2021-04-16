package com.design;

public class FactoryCreate {
	SBI objectCreate(String value){
		if(value.equals("SBI")){
			return new SBI();
		}return null;
	}
}
