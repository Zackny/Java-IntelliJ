package com.syntsx.class19;

public class Task2 {
    /*Write a java program of class Student that takes student name and 3 subject
    grades. Inside your class alse have a method to calculate average grade. Test student class for five
    different students with different marks. Your program should print an average mark of each students name.
     */
    String name;
    double subject1;
    double subject2;
    double subject3;

    public Task2(String name, double subject1,double subject2, double subject3){
        this.name=name;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    void printAvgGrade(){
        System.out.println((subject1+subject2+subject3)/3);
    }

}
