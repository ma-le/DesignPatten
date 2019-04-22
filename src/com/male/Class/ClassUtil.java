package com.male.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

    public static void printMessage(Object obj){
        Class<?> aClass = obj.getClass();
        System.out.println("类名称："+aClass.getName());

        Method[] methods = aClass.getMethods();
        for (Method m : methods){
            Class<?> returnType = m.getReturnType();
            System.out.print(returnType.getName()+" ");
            System.out.print(m.getName()+"(");

            Class<?>[] parameterTypes = m.getParameterTypes();
            for(Class c : parameterTypes){
                System.out.print(c.getName()+",");
            }
            System.out.println(")");
        }
    }

    public static void printFieldMessage(Object obj){
        Class<?> aClass = obj.getClass();

        //所有public成员变量信息
//        Field[] fields = aClass.getFields();
        Field[] fields = aClass.getDeclaredFields();

        for(Field f : fields){
            System.out.println("成员变量的名字："+f.getName());

            Class<?> type = f.getType();
            System.out.println("成员变量类型的类类型："+type.getName());
        }
    }

    public static void printConMessage(Object obj){//构造函数的

        Class<?> aClass = obj.getClass();
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();

        for(Constructor c : constructors){
            System.out.print(c.getName()+" ");
            System.out.print("(");

            Class[] parameterTypes = c.getParameterTypes();
            for(Class param : parameterTypes){
                System.out.print(param.getName()+",");
            }
            System.out.println(")");
        }

    }

}
