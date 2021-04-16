package com.design;

abstract class Bank {
	protected double interestrate;
	abstract void getInterest();
	double getInterest(int capital){
		return interestrate*capital/12;
	}
}
