package com.syntsx.class24;

public class TAsk1Tester {
    public static void main(String[] args) {
        Student syntaxStudent = new Student();
        Student collegeStudent = new Student();
        Student[] student = {new syntaxStudent(), new CollegeStudent()};

        for (Student stu : student) {


            stu.doHomework();
            stu.study();
            stu.practice();
        }

    }
}
