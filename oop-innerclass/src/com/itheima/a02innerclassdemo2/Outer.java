package com.itheima.a02innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
    }

    public Inner getInstance() {
        return new Inner();
    }
}
