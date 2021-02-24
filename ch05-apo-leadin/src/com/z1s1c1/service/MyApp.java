package com.z1s1c1.service;

import com.z1s1c1.handler.MyIncovationHandler;
import com.z1s1c1.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        /*//调用doSome,doOther
        SomeService service = new SomeServiceImpl();
        service.doSome();
        System.out.println("=======================");
        service.doOther();*/

        //使用jdk的proxy创建代理对象
        //创建目标对象
        SomeService target = new SomeServiceImpl();

        //创建InvocationHandler
        InvocationHandler handler = new MyIncovationHandler(target);

        //使用proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);

        //通过代理执行方法，会调用handler中的invoke()
        proxy.doSome();
        proxy.doOther();
    }
}
