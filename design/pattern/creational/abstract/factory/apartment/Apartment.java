package com.company.design.pattern.creational.abstactt.factory.apartment;

import com.company.design.pattern.creational.abstactt.factory.Home;

/**
 * Created by vishal on 07-Apr-18.
 */
public class Apartment extends Home {

    private String garden;
    private String parking;

    public Apartment(String garden, String parking, Integer roomCount) {
        super(roomCount);
        this.garden = garden;
        this.parking = parking;
    }
}
