package com.company.design.pattern.structral.decorator;

/**
 * Created by vishal on 09-Apr-18.
 * This is used when we want to modify the behaviour of current object not the whole class
 * and this is done at run time while creating objects.
 * <p>
 * Diff b/w Decorator and Proxy is proxy modifies behavior of class which will affect all proxy objects
 * but decorator decorates a particular object.
 * <p>
 * While Adapter is used b/w two incompatible interfaces.
 * <p>
 * We can achieve decorator kind behavior with composition and inheritance.
 * but this will not be dynamic behaviour and more we need to create sub classes for every variation.
 */
public class DecoratorClient {

    public static void main(String[] args) {

        Car car1 = new LuxuryCar(new BasicCar());
        car1.assemble();

        Car car2 = new LuxuryCar(new SportsCar(new BasicCar()));
        car2.assemble();
    }
}
