package com.z1s1c1;

import com.z1s1c1.service.SomeService;
import com.z1s1c1.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;
import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void Test02(){
        //使用spring容易创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就表示spring容器，通过这个容器对象，就可以适用对象了
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象，要调用容器的方法
        //getBean("配置文件中bean的id值")
        SomeService service = (SomeService) ac.getBean("someService");
        //使用spring创建好的对象
        service.doSome();
    }
    /*
    *  获取spring容器中java对象的信息
    *
    * */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法吗，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量："+nums);
        //容器中每个定义的对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for (String name: names
             ) {
            System.out.println("容器中定义的方法的名称为:"+name);
        }
    }

    //获取一个非自定义的类对象
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ac.getBean("mydate");
        System.out.println(date);
    }
}
