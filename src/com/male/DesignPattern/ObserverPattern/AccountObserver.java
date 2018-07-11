package com.male.DesignPattern.ObserverPattern;

/**
 * ����
 */
public class AccountObserver extends Observer {

	public AccountObserver(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("�����б仯   ��Ӧ���ˡ�����Ҫ���  �˴�������ҵ��   ���ʱ�Ϊ:"+subject.getMoneyRate());
	}

}
