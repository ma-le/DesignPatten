package com.male.ChainOfResponsibility.demo2;

public class InterceptorTwo extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor2".equals(condition)){
			System.out.println("À¹½ØÆ÷µ½...2");
		}else{
			System.out.println("À¹½ØÆ÷2À¹½Ø²»µ½");
			nextchain.beginInterceptor(condition);
		}
	}

}
