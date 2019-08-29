package com.male.DesignPattern.ObserverPattern;

public class test {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new AccountObserver(subject);
		new IncomeObserver(subject);
		new InterestObserver(subject);
		
		System.out.println("first==================");
		subject.setMoneyRate(15);
	}
}
