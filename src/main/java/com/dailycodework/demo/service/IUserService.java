package com.dailycodework.demo.service;

import com.dailycodework.demo.model.User;

import java.util.List;

/**
 * @author Miao Yu
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}