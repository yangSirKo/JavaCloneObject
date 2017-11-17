package com.atyang.prototypePattern.shenClone;

/**
 * Created by 杨Sir on 2017/11/17.
 * 员工类，维护了一个管理员类
 */
public class Employee implements Cloneable{

    private Integer sId;
    private String stuName;
    private Manager manager;

    public Employee() {
    }

    public Employee(Integer sId, String stuName, Manager manager) {
        this.sId = sId;
        this.stuName = stuName;
        this.manager = manager;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        //在克隆employee对象时，需将引用的 Manager对象也进行克隆，达到深复制的目的，，
        //如果manager对象中也引用其他对象，在manager的clone方法中也要显式克隆其引用的对象。
        employee.setManager((Manager) employee.getManager().clone());
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sId=" + sId +
                ", stuName='" + stuName + '\'' +
                ", manager=" + manager +
                '}';
    }
}
