package com.male.DesignPattern.DecoratorPattern.demo1;

public class test {

	public static void main(String[] args) {
		Shape circle = new Circle();
		
		Shape rectangle = new Rectangle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("circle with normal border");
		
		circle.draw();
		
		System.out.println("rectangle with normal border");
		
		rectangle.draw();
		
		System.out.println("circle of red border");
		
		redCircle.draw();
		
		System.out.println("rectangle of red border");
		
		redRectangle.draw();
	}
}
