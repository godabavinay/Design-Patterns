package Factory.PaymentStaticFactory;

import Factory.Payment.CreditCardPayment;
import Factory.Payment.Payment;
import Factory.Payment.PaypalPayment;
import Factory.Payment.UpiPayment;

public class PaymentStaticFactory {
    public static Payment getPayment(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "credit": return new CreditCardPayment();
            case "paypal": return new PaypalPayment();
            case "upi": return new UpiPayment();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
