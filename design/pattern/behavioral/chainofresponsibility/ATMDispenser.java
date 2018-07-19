package com.company.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by vishal on 10-Apr-18.
 */
public class ATMDispenser {

    private Dispenser dispenser1;

    public ATMDispenser() {
        this.dispenser1 = new FifityDispenser();
        Dispenser dispenser2 = new TwentyDispenser();
        Dispenser dispenser3 = new TenDispenser();
        dispenser1.setNext(dispenser2);
        dispenser2.setNext(dispenser3);
    }

    public void dispense(int amount) {
        dispenser1.dispense(amount);
    }
}
