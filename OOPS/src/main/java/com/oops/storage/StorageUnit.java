package com.oops.storage;

import com.oops.makePayment.MakePayment;

import java.util.HashMap;
import java.util.Map;

public class StorageUnit {
    private Map<String, MakePayment> paymentMethod;

    public StorageUnit(){
         paymentMethod = new HashMap<>();
    }

    public void addPayment (String name, MakePayment paymentName){
        paymentMethod.put(name, paymentName);
    }

    public void doPayment(String key){
        MakePayment payment = paymentMethod.get(key);
        payment.pay();
    }

}
