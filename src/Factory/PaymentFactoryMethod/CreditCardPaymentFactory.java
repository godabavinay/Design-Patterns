package Factory.PaymentFactoryMethod;

import Factory.Payment.CreditCardPayment;
import Factory.Payment.Payment;

public class CreditCardPaymentFactory implements PaymentFactoryMethod {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
