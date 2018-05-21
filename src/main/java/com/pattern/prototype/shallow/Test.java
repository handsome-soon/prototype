package com.pattern.prototype.shallow;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Test {

    public static void main(String[] args) {
        Shallow shallow = new Shallow();
        shallow.setName("张三");
        try {
            Shallow shallow1  = (Shallow) shallow.clone();
            System.out.println(shallow1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
