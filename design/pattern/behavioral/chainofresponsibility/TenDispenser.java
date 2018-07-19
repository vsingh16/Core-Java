package com.company.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by vishal on 10-Apr-18.
 */
public class TenDispenser implements Dispenser {

    private Dispenser dispenser;

    @Override
    public void setNext(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    public void dispense(int amount) {

        if (amount >= 10) {
            int count = amount / 10;
            int remaining = amount % 10;
            System.out.println(count + ": 10 rs notes");
            if (remaining != 0) {
                dispenser.dispense(remaining);
            }
        } else {
            dispenser.dispense(amount);
        }
    }

}
