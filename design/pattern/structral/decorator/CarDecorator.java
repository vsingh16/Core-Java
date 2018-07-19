package com.company.design.pattern.structral.decorator;

/**
 * Created by vishal on 09-Apr-18.
 */
public class CarDecorator implements Car {

    private Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
