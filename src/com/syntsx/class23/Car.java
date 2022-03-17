package com.syntsx.class23;

public class Car {


    public class car {
        void start() {
            System.out.println("Use a key to start me");

        }

        void stop() {
            System.out.println("Use break to stop");
        }
    }
}

class BMW extends Car {
    void start() {
        System.out.println("Start with button");
    }

    void stop() {
        System.out.println("I have auto Break");
    }
}