package com.z1s1c1.service.impl;

import com.z1s1c1.service.SomeService;

//service类的代码不修改，也能增加 输出时间，事务
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
