package com.syntsx.class19;

public class Horse {

    private String name;
    private int age;   // it is a very good practice to make fields private
    private double weight;

// purpes of constractor is to give initial value to the fields of class
    public Horse(String name, int horseAge, double horseWeight) {
        this.name = name;
        age=horseAge;
        weight=horseWeight;
    }

    void printHorseName() {
        System.out.println("name "+name);
    }

    void setName(String horseName){
        name=horseName;
}


}
