package com.atyang.prototypePattern.serializationClone;

import java.io.Serializable;

/**
 * Created by 杨Sir on 2017/11/17.
 * 序列化需要实现 Serializable 接口
 */
public class Cat implements Serializable{

    //serialVersionUID如果不指定的话，虚拟机会自动计算类的信息得到一个值，当你将对象序列化到磁盘上后，改变了类的字段，此时反序列化会失败
    //serialVersionUID如果指定的话,反序列化如果遇到没有的字段，字段值会取默认值
    static final long serialVersionUID = -7247874645443605347L;

    private String name;
    private Integer age;

    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
