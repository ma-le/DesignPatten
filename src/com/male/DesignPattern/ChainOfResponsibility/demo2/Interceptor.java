package com.male.DesignPattern.ChainOfResponsibility.demo2;

public abstract class Interceptor {

	protected Interceptor nextchain;
	
	public void setNextChain(Interceptor nextchain){
		this.nextchain = nextchain;
	}
	
	public abstract void beginInterceptor(String condition);
}
