package com.male.DesignPattern.ObserverPattern;

/**
 *
 */
public class InterestObserver extends Observer {

	public InterestObserver(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(" :"+subject.getMoneyRate());
	}

}
