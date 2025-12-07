package com.oops;

import com.oops.paymentMethods.CreditCard;
import com.oops.paymentMethods.DebitCard;
import com.oops.paymentMethods.UPI;
import com.oops.storage.StorageUnit;

public class Main {
    public static void main(String[] args) {

        StorageUnit storageUnit = new StorageUnit();
        storageUnit.addPayment("DeveshCredit", new CreditCard("1223 3445 5554 3213", "Rupay"));
        storageUnit.addPayment("DeveshDebit", new DebitCard("9987 7267 8278 2837", "Visa"));
        storageUnit.addPayment("deveshUpi", new UPI("devesh9811@oksbi", "deveshupiKey"));


        storageUnit.doPayment("DeveshCredit");
        storageUnit.doPayment("DeveshDebit");
        storageUnit.doPayment("deveshUpi");
    }
}