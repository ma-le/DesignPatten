package com.male.Class;

import java.lang.reflect.Method;

public class ClassUtil2 {

    public static void main(String[] args) {
        A a = new A();

        Class<? extends A> aClass = a.getClass();

        try {
            Method print = aClass.getMethod("print", int.class, int.class);
            print.invoke(a, 1,2);
            System.out.println("---------------------");
            Method print1 = aClass.getMethod("print", String.class, String.class);
            print1.invoke(a,"p", "p");
            System.out.println("---------------------");
            Method print2 = aClass.getMethod("print");
            print2.invoke(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class A{

    public void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a, String b){
        System.out.println(a.toUpperCase()+b.toUpperCase());
    }

    public void print(){
        System.out.println("hahahahaha........");
    }

 }
