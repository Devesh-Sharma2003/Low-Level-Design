package com.oops.paymentMethods;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String privateKey){
        super(cardNumber, privateKey);
    }

    @Override
    public void pay() {
        System.out.println("Paying via credit card");
    }
}
