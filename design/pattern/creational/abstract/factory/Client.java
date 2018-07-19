package com.company.design.pattern.creational.abstactt.factory;

import com.company.design.pattern.creational.abstactt.factory.apartment.ApartmentFactory;
import com.company.design.pattern.creational.abstactt.factory.flat.FlatFactory;

/**
 * Created by vishal on 07-Apr-18.
 */
public class Client {

    public static void main(String[] args) {
        Home simpleFlat = HomeFactory.create(new FlatFactory(), 1);

        Home simpleApartment = HomeFactory.create(new ApartmentFactory(), 1);

        System.out.println(simpleFlat);
        System.out.println(simpleApartment);
    }
}
