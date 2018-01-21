package com.minsk.spring.demo.service;

import com.minsk.spring.demo.entity.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
