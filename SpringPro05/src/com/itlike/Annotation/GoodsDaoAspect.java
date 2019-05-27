package com.itlike.Annotation;


import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GoodsDaoAspect {

    @Before(value = "execution(* com.itlike.Annotation.GoodsDaoImpl.save(..))")
    public void log(){
        System.out.println("日志");
    }


    @AfterReturning(value = "execution(* com.itlike.Annotation.GoodsDaoImpl.update(..))",returning = "res")
    public void afterReturning(Object res){
        System.out.println("后置通知"+res);
    }


    @Around(value = "execution(* com.itlike.Annotation.GoodsDaoImpl.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("之前");
        Object proceed = joinPoint.proceed();
        System.out.println("之后");
        return proceed;
    }
}
