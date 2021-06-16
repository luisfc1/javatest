package com.ejemplo.javatests.payments;

public interface PaymentGateway {

   PaymentResponse requestPayment(PaymentRequest request);

}
