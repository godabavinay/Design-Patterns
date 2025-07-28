package Factory.PaymentFactoryMethod;

import Factory.Payment.Payment;
import Factory.Payment.PaypalPayment;

public class PaypalPaymentFactory implements PaymentFactoryMethod {
    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }
}
