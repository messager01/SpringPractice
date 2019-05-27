package com.itlike.JDKProxy;

import org.junit.Test;

public class GoodsTest {

    @Test
    public void test(){
        GoodsDao goodsDao = new GoodsDaoImpl();

        GoodsJDKProxy goodsJDKProxy = new GoodsJDKProxy();
        //  获取代理对象
        GoodsDao proxy = goodsJDKProxy.createProxy(goodsDao);

        proxy.save();

        proxy.update();
    }
}
