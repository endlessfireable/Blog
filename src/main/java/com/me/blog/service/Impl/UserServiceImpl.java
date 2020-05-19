package com.me.blog.service.Impl;

import com.me.blog.dao.UserDao;
import com.me.blog.pojo.User;
import com.me.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username) {
        User user = userDao.queryByUsernameAndPassword(username);
        return user;
    }
}
