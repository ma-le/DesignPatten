package com.male.DesignPattern.ChainOfResponsibility.demo2;

public class InterceptorOne extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor1".equals(condition)){
			System.out.println("À¹½ØÆ÷µ½...1");
		}else{
			System.out.println("À¹½ØÆ÷1À¹½Ø²»µ½");
			nextchain.beginInterceptor(condition);
		}
	}

}
