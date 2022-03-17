package com.syntsx.reviewclass8;

public class Class2 {

    String generateUsername(String firstName, String lastName) {


        return firstName + "123" + lastName + ".com";

    }

    static void demand() {

        System.out.println("This is function");
    }


    public static void main(String[] args) {
        demand();
        Class2 obj = new Class2();
        System.out.println(obj.generateUsername("zare", "zack"));
    }


}
