package com.syntsx.class22;

public class IfElseDemo {

    public static void main(String[] args) {
        int max = maxNumber(10, 5);
        System.out.println(max);
        System.out.println(maxNumber(10,20));
    }

    static int maxNumber(int num1, int num2) {

        if (num1 > num2) {
            return num1;

        }
        return num2;
    }

}

