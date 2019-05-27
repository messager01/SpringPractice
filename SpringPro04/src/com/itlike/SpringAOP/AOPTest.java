package com.itlike.SpringAOP;


import com.itlike.JDKProxy.GoodsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AOPTest {

    @Autowired
    GoodsDao goodsDao;

    @Test
    public void test(){
        goodsDao.save();

        System.out.println("------------------");

        goodsDao.update();
    }


    @Test
    public void test2(){
       // goodsDao.delete();
        goodsDao.find();
    }
}
