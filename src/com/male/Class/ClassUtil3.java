package com.male.Class;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassUtil3 {

    public static void main(String[] args) {
        List<String> slist = new ArrayList<>();
        slist.add("666");

        Class<? extends List> aClass = slist.getClass();

        try {
            Method add = aClass.getMethod("add", Object.class);
            add.invoke(slist,6);
            System.out.println(slist.size());

            for (String s : slist){
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
