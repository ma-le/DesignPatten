package com.male.ChainOfResponsibility;

public abstract class Approver {

	public Approver right;
	
	public Approver getRightApprover(){
		return right;
	}
	public void setRightApprover(Approver right){
		this.right = right;
	}
	
	public abstract void ApproverRequest(Integer amount);
}
