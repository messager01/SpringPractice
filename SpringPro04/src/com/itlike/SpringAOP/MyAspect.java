package com.itlike.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void check(){
        System.out.println("权限校验");
    }

    public void log(Object res){
        System.out.println("日志记录"+res);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("提交事务");
        return proceed;
    }


    public void exceptionM(Throwable ex){
        System.out.println("产生异常");
        System.out.println(ex.getMessage());
    }

    public void after(){
        System.out.println("最终通知");
    }
}
