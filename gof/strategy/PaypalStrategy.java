package gof.strategy;

public class PaypalStrategy implements PaymentStrategy{

    private Paypal paypal;

    public PaypalStrategy(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay() {
        paypal.pay();
    }
}
