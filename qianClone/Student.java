package com.atyang.prototypePattern.qianClone;

/**
 * Created by 杨Sir on 2017/11/17.
 * 学生类
 */
public class Student implements Cloneable{

    private Integer sId;
    private String stuName;
    private Teacher teacher;

    public Student() {
    }

    public Student(Integer sId, String stuName, Teacher teacher) {
        this.sId = sId;
        this.stuName = stuName;
        this.teacher = teacher;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", stuName='" + stuName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
