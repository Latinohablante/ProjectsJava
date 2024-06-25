package com.tiendasolid;

import com.tiendasolid.payment.PaymentMethod;

public class OrderProcessor {
    private final OrderCalculator calculator;
    private final PaymentMethod paymentMethod;
    
    public OrderProcessor(OrderCalculator calculator, PaymentMethod paymentMethod) {
        this.calculator = calculator;
        this.paymentMethod = paymentMethod;
    }
    public void process(Order order) {
        double amount = calculator.calculateTotal(order);
        paymentMethod.pay(amount);
    }
}
