package com.male.Spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring1p2Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2.xml");
        UserService userServiceProxy = (UserService)context.getBean("userServiceProxy");
        userServiceProxy.createUser("da", "sha", 1);
        userServiceProxy.queryUser();
    }
}
