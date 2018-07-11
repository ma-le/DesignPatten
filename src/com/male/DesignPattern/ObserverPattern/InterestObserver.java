package com.male.DesignPattern.ObserverPattern;

/**
 * 利息
 */
public class InterestObserver extends Observer {

	public InterestObserver(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("利率有变化   对应利息$$$$$要变更  此处做具体业务   利率变为:"+subject.getMoneyRate());
	}

}
