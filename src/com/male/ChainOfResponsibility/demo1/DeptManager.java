package com.male.ChainOfResponsibility.demo1;

public class DeptManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(10000 < amount && amount <= 15000){
			System.out.println("���ž�������ͨ��������");
		}else{
			System.out.println("���ž�����Ȩ����");
			getRightApprover().ApproverRequest(amount);
		}
	}

}
