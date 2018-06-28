package com.male.ChainOfResponsibility.demo2;

public class text {

	public static void main(String[] args) {
		InterceptorOne one = new InterceptorOne();
		InterceptorTwo two = new InterceptorTwo();
		InterceptorThree three = new InterceptorThree();
		
		one.setNextChain(two);
		two.setNextChain(three);
		
		one.beginInterceptor("interceptor13");
	}
}
