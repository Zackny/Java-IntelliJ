package com.syntsx.class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="123456! #hnmkdmmkgjkhkkkAKSHGKJSNBSGHNI";
        System.out.println(str.replaceAll("[0-9]",""));

        String name="shahima"; // Always use this one its shorter
        String name2=new String("SHAHIMA in all uppercase  ");
        System.out.println(name);
        System.out.println(name2.length());
        System.out.println(name.length());
        String newName=name2.toLowerCase();
        System.out.println(name2.toLowerCase());
        System.out.println(name2.toUpperCase());
//name=null;
//System.out.println(name+name2);// you should always prefer this
       // method to perform concatenation
        System.out.println(name.concat(name2));
        name="        ";
        System.out.println(name.isEmpty());
    }
}
