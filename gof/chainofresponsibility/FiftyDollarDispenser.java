package gof.chainofresponsibility;

public class FiftyDollarDispenser implements Dispenser{

    private Dispenser nextDispenser;

    @Override
    public void setNextDispenser(Dispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        while (currency.getAmount()/50 != 0){
            currency.setAmount((currency.getAmount()/50 - 1) * 50 + currency.getAmount()%50);
            System.out.println("dispensed currency to " + currency.getAmount());
        }
        int reminder = currency.getAmount()/50;
        if(reminder == 0) System.out.println("dispense completed");
        if(nextDispenser != null) nextDispenser.dispense(currency);
    }
}
