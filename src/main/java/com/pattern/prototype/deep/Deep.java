package com.pattern.prototype.deep;

import java.io.*;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Deep implements Cloneable,Serializable {
    String name = new String();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object copy = ois.readObject();

            return  copy;
        } catch (Exception e) {
            e.printStackTrace();
            return  null
                    ;
        }
    }


    public static void main(String[] args) {
        Deep deep = new Deep();
        deep.setName("张三");
        try {
            Object deep1 = deep.clone();
            System.out.println(deep.getName()==((Deep)deep1).getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }


}
