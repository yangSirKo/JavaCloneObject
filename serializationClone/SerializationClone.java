package com.atyang.prototypePattern.serializationClone;

import java.io.*;

/**
 * Created by 杨Sir on 2017/11/17.
 */
public class SerializationClone {

    //将对象序列化为流，流中的对象是一个拷贝，真实的对象依旧在JVM中，因此反序列化得到的对象是一个深克隆
    public static <T> T deepCopy(T object){
        T obj = null;

        File  tmpFile = new File("objCopy");
        //钩子方法
        tmpFile.deleteOnExit();
        //序列化
        try(
                FileOutputStream fos = new FileOutputStream(tmpFile);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
                ){
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //反序列化
        try(
                FileInputStream fis = new FileInputStream(tmpFile);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ){
            obj = (T) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
