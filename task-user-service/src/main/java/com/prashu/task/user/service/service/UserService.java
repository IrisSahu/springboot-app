package com.prashu.task.user.service.service;

import com.prashu.task.user.service.model.User;

import java.util.List;

public interface UserService {

    public User getUserProfile(String jwt);

    public List<User> getAllUsers();
}
