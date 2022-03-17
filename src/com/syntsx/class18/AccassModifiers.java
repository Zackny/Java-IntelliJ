package com.syntsx.class18;

public class AccassModifiers {

    private String name="Naughty Tarik";
    int age=50;//default access
    protected double weight=50;
    public String color="White";

    public static void main(String[] args) {
        AccassModifiers am=new AccassModifiers();

        System.out.println(am.name);
        System.out.println(am.age);

        System.out.println(am.color);

    }





}
