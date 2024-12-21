package org.sahil.Basics.OOPS;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String userName) {
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card");
    }
}
