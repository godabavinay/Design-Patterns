package Factory;

import Factory.Payment.Payment;
import Factory.PaymentFactoryMethod.CreditCardPaymentFactory;
import Factory.PaymentFactoryMethod.PaymentFactoryMethod;
import Factory.PaymentStaticFactory.PaymentStaticFactory;

public class Main {
    public static void main(String[] args) {
        PaymentFactoryMethod paymentFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = paymentFactory.createPayment();
        creditCardPayment.pay(235.20);

        Payment upiPayment = PaymentStaticFactory.getPayment("UPI");
        upiPayment.pay(414.32);
    }
}
