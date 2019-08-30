package com.male.Spring.Aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogResultAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法返回+"+o);
    }
}
