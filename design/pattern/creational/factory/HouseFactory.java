package com.company.design.pattern.creational.factory;

/**
 * Created by vishal on 07-Apr-18.
 * This is also a creational design pattern.
 *
 * In Factory pattern, we create object without exposing the creation logic to
 * client and the client use the same common interface to create new type of object.
 *
 * In java:
 * Calendar class is example of factory,as it can create japanese,indian etc calendar.
 *
 * Factory class can have static method or we can create Singleton type Factory
 * as only one Instance of it wil be needed.
 */
public class HouseFactory {

    public static House getHouse(String type) {

        switch (type) {
            case Constants.FLAT:
                return new Flat();
            case Constants.APARTMENT:
                return new Apartment();
            default:
                return null;
        }
    }
}
