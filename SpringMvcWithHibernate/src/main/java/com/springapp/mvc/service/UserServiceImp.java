package com.springapp.mvc.service;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tunç on 26.7.2015.
 */
@Service
public class UserServiceImp implements UserService{

    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional

    public List<User> getAllUser() {
        List<User> list=userDao.getAllUser();
        return list;
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
