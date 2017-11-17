package com.atyang.prototypePattern.shenClone;

/**
 * Created by 杨Sir on 2017/11/17.
 */
public class ShenMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Manager manager = new Manager(10001,"张总",26);
        Employee employee = new Employee(1050001,"李明",manager);

        //打印原对象
        System.out.println("原对象 employee：" + employee);

        //浅克隆student对象
        Employee employeeClone = (Employee) employee.clone();
        System.out.println("克隆对象employeeClone：" + employeeClone);
        System.out.println("-------------------------------- \n");

        //修改克隆对象的 基本类型数据和包装类型数据
        employeeClone.setsId(1050002);
        employeeClone.setStuName("李小明");
        //打印原对象和克隆对象，，根据结果我发现 Integer和String类型被进行了深复制。证明 8种基本类型，包装类型和String类型默认进行深复制
        System.out.println("原对象employee：" + employee);
        System.out.println("克隆对象employeeClone：" + employeeClone);
        System.out.println("-------------------------------- \n");

        //修改克隆对象的 引用类型数据
        employeeClone.getManager().setAge(27);
        employeeClone.getManager().setName("张Sir");
        /**
         * 打印原对象和克隆对象
         * 原对象employeeClone：Employee{sId=1050001, stuName='李明', manager=Teacher{Id=10001, name='张总', age=26}}
         * 克隆对象employeeClone：Employee{sId=1050002, stuName='李小明', manager=Teacher{Id=10001, name='张Sir', age=27}}
         * 结果说明：对原对象中引用的对象进行了深复制，相当于将引用的对象在内存中重新存了一份。
         */
        System.out.println("原对象employeeClone：" + employee);
        System.out.println("克隆对象employeeClone：" + employeeClone);

    }
}
