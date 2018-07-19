package com.company.design.pattern.structral.bridge;

/**
 * Created by vishal on 10-Apr-18.
 * As per GOF:
 * Decouple abstraction from implementation, so that two can vary independently.
 *
 * It supports composition over inheritance.
 * Spring DI is an example.
 *
 * In the below example, abstraction(Car has tyre abstraction) is decoupled from implementation(Normal Tyre and Sports Tyre implementation)
 */
public class BridgeClient {

    public static void main(String[] args) {
        Car normalCar = new Car(new NormalTyre());
        normalCar.run();

        Car sportsCar = new Car(new SportsTyre());
        sportsCar.run();
    }

}
