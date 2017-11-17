package com.atyang.prototypePattern.qianClone;

/**
 * Created by 杨Sir on 2017/11/17.
 * 教师类，供学生对象引用
 */
public class Teacher {

    private int Id;
    private String name;
    private Integer age;

    public Teacher() {

    }

    public Teacher(int id, String name, Integer age) {

        Id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
}
