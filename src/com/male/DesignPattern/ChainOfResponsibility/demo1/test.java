package com.male.DesignPattern.ChainOfResponsibility.demo1;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Approver h1 = new ProjectManager();
		Approver h2 = new DeptManager();
		Class<?> forName = Class.forName("com.male.ChainOfResponsibility.GeneralManager");
		GeneralManager hn = (GeneralManager)forName.newInstance();
		
		h1.setRightApprover(h2);
		h2.setRightApprover(hn);
		
		h1.ApproverRequest(500);
		System.out.println("====================");
		h1.ApproverRequest(10099);
		System.out.println("====================");
		h1.ApproverRequest(20000);
		
		
	}
}
