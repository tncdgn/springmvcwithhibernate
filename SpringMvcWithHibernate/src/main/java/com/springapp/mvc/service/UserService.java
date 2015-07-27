package com.springapp.mvc.service;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by Tunç on 26.7.2015.
 */
public interface UserService {
    public void addUser(User user);
    public List<User> getAllUser();
    public void deleteUser(int id);
    public void updateUser(User user);
}
