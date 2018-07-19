package com.company.design.pattern.structral.decorator;

/**
 * Created by vishal on 09-Apr-18.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Luxury Car.");
    }
}
