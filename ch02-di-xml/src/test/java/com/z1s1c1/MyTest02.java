package com.z1s1c1;

import com.z1s1c1.ba02.School;
import com.z1s1c1.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void Test01(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);

    }

    @Test
    public void Test02(){
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        School school = new School();
        school.setName("dljd");
        school.setAddress("bj");
        student.setSchool(school);
        System.out.println("student==="+student);
    }
}
