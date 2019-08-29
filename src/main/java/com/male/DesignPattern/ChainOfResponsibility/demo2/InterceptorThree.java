package com.male.DesignPattern.ChainOfResponsibility.demo2;

public class InterceptorThree extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor3".equals(condition)){
			System.out.println(" ");
		}else{
			System.out.println(" ");
		}
	}

}
