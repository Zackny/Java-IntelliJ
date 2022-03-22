package com.syntsx.reviewclass9;

public class Doctor {
    String firstName, lastName,speciality;

    public Doctor(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    static String hospital="Jorge Washington";

   static void work(){
        System.out.println("All doctors work at "+hospital);
    }
    void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }
     void work1(){
         System.out.println("All doctors work at "+hospital);
     }

}
