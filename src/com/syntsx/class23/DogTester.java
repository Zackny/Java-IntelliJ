package com.syntsx.class23;

public class DogTester {


    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        Dog dog2 = new Dog("Tomy", "Green", "RedBull", 12, 25.5);
        System.out.println(dog2);

        dog2. changeInfo ("Rocky","Black","BulDog");
        System.out.println(dog2);
    }
}