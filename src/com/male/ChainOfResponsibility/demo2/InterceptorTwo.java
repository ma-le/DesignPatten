package com.male.ChainOfResponsibility.demo2;

public class InterceptorTwo extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor2".equals(condition)){
			System.out.println("��������...2");
		}else{
			System.out.println("������2���ز���");
			nextchain.beginInterceptor(condition);
		}
	}

}
