package com.dgu_csc.akomanager_back.service;

import com.dgu_csc.akomanager_back.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Userservice {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
