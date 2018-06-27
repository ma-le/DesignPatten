package com.male.ChainOfResponsibility.demo1;

public class DeptManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(10000 < amount && amount <= 15000){
			System.out.println("部门经理审批通过☆☆☆☆☆");
		}else{
			System.out.println("部门经理无权审批");
			getRightApprover().ApproverRequest(amount);
		}
	}

}
