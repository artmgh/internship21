package com.comarch.internship.rest;

import com.comarch.internship.data.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        return createUser();
    }

    public User createUser() {
        return new User("Jan", "99121212567");
    }

    public void deleteUser(String name) {
    }

    public void updateUser(User user) {
    }
}
