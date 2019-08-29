package com.male.DesignPattern.ObserverPattern;

/**
 *
 */
public class IncomeObserver extends Observer {

	public IncomeObserver(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(" :"+subject.getMoneyRate());
	}

}
