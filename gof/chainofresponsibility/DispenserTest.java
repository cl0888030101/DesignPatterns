package gof.chainofresponsibility;

public class DispenserTest {

    public static void main(String[] args) {
        Dispenser fiftyDollarDispenser = new FiftyDollarDispenser();
        Dispenser twentyDollarDispenser = new TwentyDollarDispenser();
        fiftyDollarDispenser.setNextDispenser(twentyDollarDispenser);

        fiftyDollarDispenser.dispense(new Currency(120));
    }
}
