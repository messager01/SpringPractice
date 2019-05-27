package com.itlike.JDKProxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class GoodsJDKProxy {
    public GoodsDao createProxy(GoodsDao goodsDao){
        // 增强
       GoodsDao goodsDaoProxy = (GoodsDao) Proxy.newProxyInstance(
                goodsDao.getClass().getClassLoader(),  // 类加载器
                goodsDao.getClass().getInterfaces(),    //  接口
                new InvocationHandler() {   // 回调  以后调用该对象的任何方法  都会经过这个回调
                    @Override // 当调用对象的时候  所有方法都会来到这里
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        // 原有方法之前增加功能
                        if("save".equals(method.getName())){
                            System.out.println("权限校验");
                        }
                        GoodsDao goodDao1 = (GoodsDao) method.invoke(goodsDao, args); // 返回代理对象并执行原有方法
                           //  原有方法之后增加功能
                        return goodDao1;
                    }
                });
       return goodsDaoProxy;  // 通过goodsDaoProxy 这个对象调用方法的时候 都会经过 上面的invoke方法
    }
}
