package com.company.design.pattern.structral.decorator;

/**
 * Created by vishal on 09-Apr-18.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sports Car");
    }
}
