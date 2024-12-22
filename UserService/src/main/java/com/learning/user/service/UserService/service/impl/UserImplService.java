package com.learning.user.service.UserService.service.impl;

import com.learning.user.service.UserService.entity.User;
import com.learning.user.service.UserService.exceptions.ResourceNotFoundExceptions;
import com.learning.user.service.UserService.repository.UserRepository;
import com.learning.user.service.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserImplService implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        String randomId = UUID.randomUUID().toString();
        user.setUserId(randomId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundExceptions("User with given id not found "+userId));
    }
}
