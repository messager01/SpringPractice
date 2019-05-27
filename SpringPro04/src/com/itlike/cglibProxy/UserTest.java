package com.itlike.cglibProxy;

import org.junit.Test;

public class UserTest {
    @Test
    public void test1(){
        UserDao userDao = new UserDao();
        userDao.save();


        UserDaoCglibProxy userDaoCglibProxy = new UserDaoCglibProxy();
        UserDao cglibProxy = userDaoCglibProxy.createCglibProxy(userDao);
        cglibProxy.save();
    }


}
