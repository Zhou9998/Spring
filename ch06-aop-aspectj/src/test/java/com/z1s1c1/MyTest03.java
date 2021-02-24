package com.z1s1c1;

import com.z1s1c1.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someservice");
        //通过代理的对象执行方法，实现目标方法执行时，增强了功能
        /*String str = proxy.doOther("lisi",20);
        System.out.println(str);*/
        String str = proxy.doFirst("zhangsan",20);//myAround

        System.out.println(str);
    }
}
