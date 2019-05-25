package com.itlike.demo1;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("oracle----save");
    }

    @Override
    public void delete() {
        System.out.println("oracle----delete");
    }
}
