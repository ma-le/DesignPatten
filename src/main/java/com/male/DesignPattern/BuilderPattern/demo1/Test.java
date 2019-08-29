package com.male.DesignPattern.BuilderPattern.demo1;


import com.male.DesignPattern.BuilderPattern.Student;

public class Test {

    public static void main(String[] args) {
        MealA mealA = new MealA();

        Waiter waiter = new Waiter(mealA);

        Meal m = waiter.construct();
        System.out.println("食物"+m.getFood()+"。。。饮品"+m.getDrink());

        Student s = new Student.builder(1).setName("jim").setAge(12).build();
        System.out.println(s.toString());
    }

}
