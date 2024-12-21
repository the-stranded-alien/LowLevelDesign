package org.sahil.Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("SahilDebitCard", new DebitCard("1234", "Sahil Gupta"));
        ps.addPaymentMethod("SahilCreditCard", new CreditCard("5678", "Sahil Gupta"));
        ps.addPaymentMethod("SahilUPI", new UPI("sahil123"));
        ps.addPaymentMethod("SahilWallet", new Wallet());

        ps.makePayment("SahilUPI");
        ps.makePayment("SahilDebitCard");
        ps.makePayment("SahilWallet");
    }
}
