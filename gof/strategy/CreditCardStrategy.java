package gof.strategy;

public class CreditCardStrategy implements PaymentStrategy{

    private CreditCard creditCard;

    public CreditCardStrategy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay() {
        creditCard.pay();
    }
}
