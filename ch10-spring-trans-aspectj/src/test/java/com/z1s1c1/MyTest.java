package com.z1s1c1;

import com.z1s1c1.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");
        //com.sun.proxy.$Proxy12
        System.out.println("service是代理：" +service.getClass().getName());
        service.buy(1001,10);
    }
}
