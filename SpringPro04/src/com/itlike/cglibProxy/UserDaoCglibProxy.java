package com.itlike.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserDaoCglibProxy implements MethodInterceptor {
    public UserDao createCglibProxy(UserDao userDao){

        //1.  创建核心类
        Enhancer enhancer = new Enhancer();
        // 2.  设置父类  cglib动态代理实质上是通过  继承的方式   会自动的创建一个子类继承当前类  即继承UserDao
        enhancer.setSuperclass(userDao.getClass());  //类.class    对象.getClass
        // 3.  设置回调
        enhancer.setCallback(this);
        //4.  创建代理对象   就是把生成的子类进行返回
        UserDao obj = (UserDao) enhancer.create();    //  obj  就是创建的子类
        return obj;
    }


    //  o  就是产生的子类
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        if ("save".equals(method.getName())){
            System.out.println(" 在原有父类方法之前调用");
        }
        Object o1 = methodProxy.invokeSuper(o, args);   //  调用父类方法
        return o1;
    }
}
