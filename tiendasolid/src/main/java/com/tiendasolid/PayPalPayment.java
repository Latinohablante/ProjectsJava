package com.tiendasolid;

import com.tiendasolid.payment.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying with PayPal: " + amount);
    }
}
