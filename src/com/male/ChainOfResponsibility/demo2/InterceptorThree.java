package com.male.ChainOfResponsibility.demo2;

public class InterceptorThree extends Interceptor {

	@Override
	public void beginInterceptor(String condition) {
		// TODO Auto-generated method stub

		if("interceptor3".equals(condition)){
			System.out.println("拦截器到...3");
		}else{
			System.out.println("没有能拦截得到的");
		}
	}

}
