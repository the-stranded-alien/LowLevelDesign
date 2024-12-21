package org.sahil.Basics.OOPS;

abstract public class Card implements PaymentMethod {
    private String cardNumber;
    private String userName;

    public Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
