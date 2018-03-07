package com.example.mac.inclassassignment07_mengqiz;

import java.io.Serializable;

/**
 * Created by mac on 3/6/18.
 */
public class People implements Serializable {
    private String name;
    private int age;
    private boolean isSingle;

    public People(String name, int age, boolean isSingle) {
        this.name = name;
        this.age = age;
        this.isSingle = isSingle;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsSingle() {
        return isSingle;
    }


    public String toString() {
        return "Name: " + name + "\nAge :" + age + "\nIs Single: " + isSingle+ "\n";
    }
}
