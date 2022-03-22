package com.syntsx.reviewclass9;

public class DoctorTester {
    public static void main(String[] args) {
        Doctor obj=new Doctor("Zarko","Zack","Surgeon");

        obj.printInfo();
        obj.work1();
        Doctor obj1=new Doctor("za","za");
        obj1.work1();
        obj1.printInfo();
        Doctor.hospital="i nova";
        obj.printInfo();
    }
}
