package com.male.DesignPattern.ChainOfResponsibility.demo2;

public class InterceptorOne extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor1".equals(condition)){
			System.out.println(" ...1");
		}else{
			System.out.println(" ");
			nextchain.beginInterceptor(condition);
		}
	}

}
