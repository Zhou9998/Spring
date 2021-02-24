package com.z1s1c1;

import com.z1s1c1.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);

    }

    @Test
    public void Test02(){
        System.out.println("shushu");
    }
}
