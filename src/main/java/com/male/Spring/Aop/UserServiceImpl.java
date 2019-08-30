package com.male.Spring.Aop;

public class UserServiceImpl implements UserService {
    private User user = null;

    @Override
    public User createUser(String firstname, String lastname, int age) {
        user = new User();
        user.setAge(age);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        return user;
    }

    @Override
    public User queryUser() {
        return user;
    }
}
