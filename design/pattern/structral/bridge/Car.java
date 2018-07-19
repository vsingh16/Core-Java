package com.company.design.pattern.structral.bridge;

/**
 * Created by vishal on 10-Apr-18.
 */
public class Car {

    private Tyre tyre;

    public Car(Tyre tyre) {
        this.tyre = tyre;
    }

    public void run() {
        System.out.println("Car running with max speed" + tyre.maxSpeed());
    }
}
