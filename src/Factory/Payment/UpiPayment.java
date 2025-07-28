package Factory.Payment;

public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}
