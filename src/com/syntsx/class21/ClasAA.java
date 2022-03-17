package com.syntsx.class21;

public class ClasAA {
    String name;
    int age;
    double weight;

    public ClasAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }
}
    class ClassBB extends ClasAA {

        public ClassBB(String name, int age, double weight) {
            super(name, age, weight);
        }
    }

    class Tester1 {
       public static void main(String[] args) {
            ClassBB classbb = new ClassBB("Tristan", 25, 65);
            classbb.printInfo();
        }
    }


