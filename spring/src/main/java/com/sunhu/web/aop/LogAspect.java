package com.sunhu.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/6/5.
 */
@Aspect//切面类
@Component
public class LogAspect {
    //前置方法
    @Before("execution(* com.sunhu..*.*(..))")//织入
    public void log(){
        System.out.println("aspect method log");
    }

    @After("execution(* com.sunhu.dao..*.*(..))")//织入
    public void log2(JoinPoint joinPoint){//joinPoint 切入点
        System.out.println("after method log class:" + joinPoint.getClass() + "，args:" + Arrays.asList(joinPoint.getArgs()));
    }
}
