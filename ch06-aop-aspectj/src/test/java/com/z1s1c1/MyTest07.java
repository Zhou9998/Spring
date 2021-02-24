package com.z1s1c1;

import com.z1s1c1.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeServiceImpl proxy = (SomeServiceImpl) ctx.getBean("someservice");
        System.out.println("proxy:"+proxy.getClass().getName());
        /*
         *目标类没有接口，使用cglib动态代理，spring框架会自动应用cglib
         *  com.z1s1c1.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$fa00daed
         */
        proxy.doThird();
    }
}
