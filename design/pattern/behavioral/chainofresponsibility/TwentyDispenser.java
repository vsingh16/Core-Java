package com.company.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by vishal on 10-Apr-18.
 */
public class TwentyDispenser implements Dispenser {

    private Dispenser dispenser;

    @Override
    public void setNext(Dispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }

    @Override
    public void dispense(int amount) {

        if (amount >= 20) {
            int count = amount / 20;
            int remaining = amount % 20;
            System.out.println(count + ": 20 rs notes");
            if (remaining != 0) {
                dispenser.dispense(remaining);
            }
        } else {
            throw new RuntimeException("Unable to dispense entered amount");
        }
    }

}
