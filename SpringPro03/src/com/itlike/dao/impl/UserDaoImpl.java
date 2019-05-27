package com.itlike.dao.impl;

import com.itlike.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void delete() {
        System.out.println("从数据库删除");
    }
}
