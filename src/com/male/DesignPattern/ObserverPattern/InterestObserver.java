package com.male.DesignPattern.ObserverPattern;

/**
 * ��Ϣ
 */
public class InterestObserver extends Observer {

	public InterestObserver(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("�����б仯   ��Ӧ��Ϣ$$$$$Ҫ���  �˴�������ҵ��   ���ʱ�Ϊ:"+subject.getMoneyRate());
	}

}
