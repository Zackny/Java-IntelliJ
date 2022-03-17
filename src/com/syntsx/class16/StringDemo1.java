package com.syntsx.class16;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="Batch 12 is good";
        System.out.println(str.replace("good","great"));
        System.out.println(str.replace("o","0"));
        System.out.println(str.replace(" ","_"));
        System.out.println(str.replace(" ",""));


        String name="       Moree   d         ";
        System.out.println(name);
        System.out.println(name.trim());
        String name2="Run Moreed";// a person who always fear his wife and is
       // always obedient or submissive to his wife
        System.out.println(name2.toLowerCase().startsWith("run")); // method
       // chaining
        System.out.println(name2.startsWith("Moreed"));
        System.out.println(name2.endsWith("Moreed"));
        System.out.println(name2.endsWith("d"));
        System.out.println(name2.toLowerCase().contains("m"));


    }
}
