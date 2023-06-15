package gof.chainofresponsibility;

/*
* Chain: implement nextDispenser function to store next dispenser
* */
interface Dispenser {
    void setNextDispenser(Dispenser nextDispenser);
    void dispense(Currency currency);

}
