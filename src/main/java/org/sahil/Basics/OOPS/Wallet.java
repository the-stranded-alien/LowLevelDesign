package org.sahil.Basics.OOPS;

public class Wallet implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Making payment via Wallet");
    }
}
