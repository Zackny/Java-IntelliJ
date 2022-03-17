package com.syntsx.class24;

public abstract class Phone {

    void makePhoneCalls() {
        System.out.println("Making  a phone calls");
    }

    void sendText() {
        System.out.println("Sending txt");
    }

    abstract void displayPictures();


}

abstract class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Use photo app");
    }

}

class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Use gallery");
    }
}
