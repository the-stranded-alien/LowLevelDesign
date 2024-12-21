package org.sahil.Basics.OOPS;

public class UPI implements PaymentMethod {
    String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI " + upiId);
    }
}
