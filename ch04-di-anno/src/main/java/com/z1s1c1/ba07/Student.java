package com.z1s1c1.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {
    @Value(value="zhangsan")
    private String name;
    private Integer age;

    /*
    * 引用类型
    *   @Resource:来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
    *               使用的也是自动注入的原理，支持byName,byType,默认是byName
    *   位置：1.在属性定义的上面，无需set方法，推荐使用
    *       2.在set方法的上面
    *
    * @Resource只使用byName方式，需要增加一个属性name
    * name值是bean的id(名称)
    * */
    //默认是byName，先使用byName自动注入，如果byName赋值失败，再使用byType。
    @Resource(name = "mySchool")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "29")
    public void setAge(Integer age) {
        this.age = age;
    }
}
