package com.male.DesignPattern.DecoratorPattern.demo1;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	public void setBorder(Shape decoratorShape){
		System.out.println("Border color : red");
	}

	public void draw(){
		decoratorShape.draw();
		setBorder(decoratorShape);
	}
}
