package com.syntsx.class21;

public class MethodOverloadDemo {
    static void add(int num1,int num2){
        System.out.println("m1");
    }
   static void add(double num1,double num2){
       System.out.println("m2");



    }
    static void add(String num1,String num2) {
        System.out.println("m3");
    }
    public static void main(String[] args) {
        add(10,20);
        add("10","20");
    }
}
