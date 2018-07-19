package com.company.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by vishal on 10-Apr-18.
 */
public interface Dispenser {

    void setNext(Dispenser nextDispenser);

    void dispense(int amount);
}
