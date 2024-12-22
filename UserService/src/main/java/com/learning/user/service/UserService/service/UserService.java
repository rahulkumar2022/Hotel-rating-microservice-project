package com.learning.user.service.UserService.service;

import com.learning.user.service.UserService.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(String userId);
}
