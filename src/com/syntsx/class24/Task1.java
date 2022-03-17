package com.syntsx.class24;
class Student {

    void study() {
        System.out.println("Must study to pass");
    }
        void doHomework () {
            System.out.println("Do homework");

        }
        void practice () {
            System.out.println("practice");
        }
    }

    class syntaxStudent extends Student {
        void study() {
            System.out.println("25h week");
        }

        void doHomework() {
            System.out.println("solwe repls");
        }

        void practice() {
            System.out.println("reserch");
        }
    }
        class CollegeStudent extends Student{
            void doHomework(){
                System.out.println("can skip homework");
            }
        }



public class Task1 {

    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
   */





}
