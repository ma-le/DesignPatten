package com.male.ChainOfResponsibility;

public class ProjectManager extends Approver{

	@Override
	public void ApproverRequest(Integer amount) {
		// TODO Auto-generated method stub
		if(0 < amount && amount <= 10000){
			System.out.println("项目经理审批通过☆☆☆☆☆");
		}else{
			System.out.println("项目经理无权审批 ");
			getRightApprover().ApproverRequest(amount);
		}
	}

}
