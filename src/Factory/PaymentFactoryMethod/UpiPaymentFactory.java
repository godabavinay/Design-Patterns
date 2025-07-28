package Factory.PaymentFactoryMethod;

import Factory.Payment.Payment;
import Factory.Payment.UpiPayment;

public class UpiPaymentFactory implements PaymentFactoryMethod {
    @Override
    public Payment createPayment() {
        return new UpiPayment();
    }
}
