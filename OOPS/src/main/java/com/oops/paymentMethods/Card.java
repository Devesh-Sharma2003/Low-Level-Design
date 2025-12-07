package com.oops.paymentMethods;

import com.oops.makePayment.MakePayment;

public abstract class Card implements MakePayment {
    private String cardNumber;
    private String privateKey;

    public Card(String cardNumber, String privateKey){
        this.cardNumber = cardNumber;
        this.privateKey = privateKey;
    }

    public abstract void pay();
}
