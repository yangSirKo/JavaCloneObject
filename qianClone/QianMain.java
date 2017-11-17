package com.atyang.prototypePattern.qianClone;

/**
 * Created by 杨Sir on 2017/11/17.
 * 浅复制测试
 */
public class QianMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Teacher teacher = new Teacher(1001,"王老师",22);
        Student student = new Student(1060001,"小明",teacher);
        //打印原对象
        System.out.println("原对象student：" + student);

        //浅克隆student对象
        Student studentClone = (Student) student.clone();
        System.out.println("克隆对象studentClone：" + studentClone);
        System.out.println("-------------------------------- \n");

        //修改克隆对象的 基本类型数据和包装类型数据
        studentClone.setsId(1060002);
        studentClone.setStuName("杨小明");
        //打印原对象和克隆对象，，根据结果我发现 Integer和String类型被进行了深复制。证明 8种基本类型，包装类型和String类型默认进行深复制
        System.out.println("原对象student：" + student);
        System.out.println("克隆对象studentClone：" + studentClone);
        System.out.println("-------------------------------- \n");

        //修改克隆对象的 引用类型数据
        studentClone.getTeacher().setAge(21);
        studentClone.getTeacher().setName("王Sir");
        /**
         * 打印原对象和克隆对象
         * 原对象student：Student{sId=1060001, stuName='小明', teacher=Teacher{Id=1001, name='王Sir', age=21}}
         * 克隆对象studentClone：Student{sId=1060002, stuName='杨小明', teacher=Teacher{Id=1001, name='王Sir', age=21}}
         * 结果说明：对原对象中引用的对象进行了浅复制，相当于只复制了引用，两个引用指向同一个对象。
         */
        System.out.println("原对象student：" + student);
        System.out.println("克隆对象studentClone：" + studentClone);

    }
}
