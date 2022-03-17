package com.syntsx.class23;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard obj = new CreditCard(100, .15);
        obj.calculateInterest();
        Ax ax = new Ax(100, 15);
        ax.calculateInterest();
        Visa visa = new Visa(100, 0.15);
        visa.calculateInterest();
    }
}
