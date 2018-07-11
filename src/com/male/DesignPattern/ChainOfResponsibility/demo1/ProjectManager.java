package com.male.DesignPattern.ChainOfResponsibility.demo1;

public class ProjectManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(0 < amount && amount <= 10000){
			System.out.println("��Ŀ��������ͨ��������");
		}else{
			System.out.println("��Ŀ������Ȩ���� ");
			getRightApprover().ApproverRequest(amount);
		}
	}

}
