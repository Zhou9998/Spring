package com.z1s1c1.service.impl;

import com.z1s1c1.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参构造方法！");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeService的doSome()方法");
    }
}
