package gof.chainofresponsibility;

public class TwentyDollarDispenser implements Dispenser{
    private Dispenser nextDispenser;
    @Override
    public void setNextDispenser(Dispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        while (currency.getAmount()/20 != 0){
            currency.setAmount((currency.getAmount()/20 - 1) * 20 + currency.getAmount()%20);
            System.out.println("Dispensed currency to " + currency.getAmount());
        }
        int reminder = currency.getAmount()%20;
        if(reminder == 0) System.out.println("dispense completed");
        if(nextDispenser != null) nextDispenser.dispense(currency);
    }
}
