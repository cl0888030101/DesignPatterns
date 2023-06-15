package gof.strategy;

public class CreditCard implements Payment{
    private long id;
    private String password;

    public CreditCard(long id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void pay() {
        System.out.println("pay by credit card");
    }
}
