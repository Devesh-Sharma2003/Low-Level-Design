package com.oops.paymentMethods;

import com.oops.makePayment.MakePayment;

import java.sql.SQLOutput;

public class UPI implements MakePayment {
    private String upiId;
    private String key;

    public UPI(String upiId, String privateKey){
        this.upiId = upiId;
        this.key = privateKey;
    }

    @Override
    public void pay() {
        System.out.println("Paying via upi "+upiId);
    }
}
