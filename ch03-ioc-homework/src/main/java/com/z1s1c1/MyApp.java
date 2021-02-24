package com.z1s1c1;

import com.z1s1c1.domain.SysUser;
import com.z1s1c1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //从spring容器中获取 UserService类型的对象 , dao, service都是spring管理的
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) ctx.getBean("userService");

        SysUser user  = new SysUser();
        user.setName("lisi");
        user.setAge(20);
        service.addUser(user);
    }
}
