package com.itlike.service.impl;

import com.itlike.dao.UserDao;
import com.itlike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;
    @Override
    public void delete() {
        userDao.delete();
    }
}
