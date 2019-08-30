package com.male.Spring.Aop;

public interface UserService {
    User createUser(String firstname, String lastname, int age);

    User queryUser();
}
