package com.academy.service;

import com.academy.model.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public class LoginService {

    private final List<User> users;

    public LoginService() {
        users = new ArrayList<>();

        User user1 = new User("admin", "admin");
        User user2 = new User("user", "user");

        users.add(user1);
        users.add(user2);
    }

    public boolean checkCredential(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
