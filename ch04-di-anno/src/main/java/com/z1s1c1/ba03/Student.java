package com.z1s1c1.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /*
    * @Value 简单类型的属性赋值
    * 属性：value是String类型的，表示简单类型的属性值
    * 位置：1.在属性定义的上面，无需set方法，推荐使用
    *      2.在set方法的上面
    * */
    @Value(value="zhangsan")
    private String name;
    private Integer age;

    /*
    * 引用类型
    *   @Autowired: spring框架提供的注解，实现引用类型的赋值。spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byName，byType
    *   @Autowired:默认使用的是byType自动注入。
    *   位置：1)在属性定义的上面，无需set方法，推荐使用
    *        2)在set方法上面
    * */
    @Autowired
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Value(value = "29")
    public void setAge(Integer age) {
        this.age = age;
    }
}
