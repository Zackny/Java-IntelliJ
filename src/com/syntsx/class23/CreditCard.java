package com.syntsx.class23;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.

     */
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public CreditCard() {

    }

    void calculateInterest() {
        System.out.println(balance * interest);


    }

}

class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        super.calculateInterest();
    }
}

class Ax extends CreditCard {
    public Ax(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        super.calculateInterest();
    }
}



