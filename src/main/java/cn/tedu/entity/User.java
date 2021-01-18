package cn.tedu.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {
    private  String name;
    private  int age;
    private  String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    @PostConstruct
    public void open(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void diea(){
        System.out.println("销毁是运行的代码");
    }
}
