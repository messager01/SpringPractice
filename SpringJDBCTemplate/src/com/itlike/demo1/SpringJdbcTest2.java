package com.itlike.demo1;

import com.itlike.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJdbcTest2 {

    @Autowired
   private JdbcTemplate jdbcTemplate;

    @Test
    public void insert(){
        jdbcTemplate.update("insert into account (`name` ,`money`) values (?,?)","c",5D);
    }


    @Test
    public void delete(){
        jdbcTemplate.update("delete from account where id = ?",1);
    }


    @Test
    public void update(){
        jdbcTemplate.update("update account set money=?where id=?",1000D,2);
    }


    @Test
    public void query(){
        String name = jdbcTemplate.queryForObject("select name from account where id =?", String.class, 2);
        System.out.println(name);
    }

    @Test
    public void query1(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(count);
    }

    @Test
    public void queryAccount(){
        Account account = jdbcTemplate.queryForObject("select * from account where id = ?", new MyRowMap(), 2);
        System.out.println(account);
    }

    @Test
    public void queryAll(){
        List<Account> accounts = jdbcTemplate.query("select * from account", new MyRowMap());

        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}


class MyRowMap implements RowMapper<Account>{

       //  封装查询结果
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getDouble("money"));
        return account;
    }
}
