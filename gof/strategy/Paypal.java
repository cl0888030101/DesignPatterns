package gof.strategy;

public class Paypal implements Payment {
    private String account;
    private String password;

    public Paypal(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public void pay(){
        System.out.println("pay by paypay");
    }
}
