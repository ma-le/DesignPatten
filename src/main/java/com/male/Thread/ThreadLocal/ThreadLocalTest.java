package com.male.Thread.ThreadLocal;

import com.male.Spring.Aop.User;

public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal a1 = new ThreadLocal();
        ThreadLocal a2 = new ThreadLocal();
        a1.set("666");
        a2.set(123);
        System.out.println(a1.get());
    }
}
