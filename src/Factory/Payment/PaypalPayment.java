package Factory.Payment;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal payment: " + amount);
    }
}
