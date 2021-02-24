package com.z1s1c1.handler;

import com.z1s1c1.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncovationHandler implements InvocationHandler {

    private Object target;//SomeServiceImpl类
    public MyIncovationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke();
        System.out.println("MyIncovationHandler中的handler");
        String methodName = method.getName();
        Object res = null;
        if ("doSome".equals(methodName)){//joinPoint Pointcut
            ServiceTools.doLog();//在目标方法执行之前，输出时间
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target,args);//SomeServiceImpl.doSome()
            ServiceTools.doTrans();//在目标方法执行之后。提交事务
        }else {
            res = method.invoke(target,args);//SomeServiceImpl.doOther()
        }
        return res;
    }
}
