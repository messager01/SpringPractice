package com.itlike.demo1;

public class UserDaoMySQLImpl implements UserDao {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("mysql----save");
    }

    @Override
    public void delete() {
        System.out.println("mysql----delete");
    }
}
