package com.atyang.prototypePattern.serializationClone;

import java.io.Serializable;

/**
 * Created by 杨Sir on 2017/11/17.
 */
public class Person implements Serializable{

    private Integer sId;
    private String stuName;
    private Cat cat;

    public Person() {
    }

    public Person(Integer sId, String stuName, Cat cat) {
        this.sId = sId;
        this.stuName = stuName;
        this.cat = cat;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sId=" + sId +
                ", stuName='" + stuName + '\'' +
                ", cat=" + cat +
                '}';
    }
}
