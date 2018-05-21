package com.pattern.prototype.shallow;

/**
 * Created by 15995 on 2018/5/21.
 *  浅克隆
 *
 */
public class Shallow implements  Cloneable {

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
