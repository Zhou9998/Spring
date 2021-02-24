package com.z1s1c1.ba04;

public class Student {
    private String name;
    private int age;
    //声明一个引用类型
    private School school;

    public Student() {
    }

    public Student(String myname, int myage, School myschool) {
        System.out.println("======Student的有参数构造方法");
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
