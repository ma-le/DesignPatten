package com.male.DesignPattern.ChainOfResponsibility.demo1;

public class GeneralManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(amount > 15000){
			System.out.println("总经理审批通过☆☆☆☆☆");
		}
	}
}
