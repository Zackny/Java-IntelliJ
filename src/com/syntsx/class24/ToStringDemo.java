package com.syntsx.class24;

public class ToStringDemo {
    String name;
    int age;

    public ToStringDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
public String toString(){
        return name+age;
}
    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Mr A ",35);
        System.out.println(toStringDemo.toString());
    }
}
