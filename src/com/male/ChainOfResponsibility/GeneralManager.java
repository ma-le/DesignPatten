package com.male.ChainOfResponsibility;

public class GeneralManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(amount > 15000){
			System.out.println("�ܾ�������ͨ��������");
		}
	}
}
