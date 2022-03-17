package com.syntsx.class18;

public class Task {

    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students



     */
String name;
String id;
static int numberOfStudents;


    public static void main(String[] args) {

        Task student1=new Task();
        student1.name="Zak";
        student1.id="123";
        Task.numberOfStudents++;

        Task student2=new Task();
        student2.name="Zak";
        student2.id="123";
        Task.numberOfStudents++;
        System.out.println(numberOfStudents);


    }


}
