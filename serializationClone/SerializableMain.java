package com.atyang.prototypePattern.serializationClone;

/**
 * Created by 杨Sir on 2017/11/17.
 * 使用序列化进行深复制
 */
public class SerializableMain {

    public static void main(String[] args) {

        Cat mimi = new Cat("咪咪",2);
        Person person = new Person(101,"旺财",mimi);

        //使用序列化与反序列化进行深复制，，注意序列化的类要实现 Serializable接口
        Person personClone = SerializationClone.deepCopy(person);
        //打印
        System.out.println("原对象Person："+ person);
        System.out.println("反序列化的对象personClone："+ personClone);

        /**
         *  修改Person 对象引用的Cat对象的值，测试是否深复制
         *  打印： Person{sId=101, stuName='旺财', cat=Cat{name='咪咪', age=2}}
         *  打印： Person{sId=101, stuName='旺财', cat=Cat{name='喵喵', age=3}}
         *  反序列深克隆成功
         */
        personClone.getCat().setName("喵喵");
        personClone.getCat().setAge(3);
        System.out.println("原对象Person："+ person);
        System.out.println("反序列化的对象personClone："+ personClone);

    }
}
