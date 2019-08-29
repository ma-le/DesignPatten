package com.male.DesignPattern.DecoratorPattern.demo1;

public abstract class ShapeDecorator implements Shape{

	protected Shape decoratorShape;
	
	public ShapeDecorator (Shape decoratorShape){
		this.decoratorShape = decoratorShape;
	}
	
	public void draw(){
		decoratorShape.draw();
	}
}
