package com.oops.paymentMethods;

public class DebitCard extends Card{

    public DebitCard(String cardNo, String key){
        super(cardNo, key);
    }

    @Override
    public void pay() {
        System.out.println("Paying via debit card");
    }
}
