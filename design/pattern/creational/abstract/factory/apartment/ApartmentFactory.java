package com.company.design.pattern.creational.abstactt.factory.apartment;

import com.company.design.pattern.creational.abstactt.factory.Home;
import com.company.design.pattern.creational.abstactt.factory.HomeAbstractFactory;

/**
 * Created by vishal on 07-Apr-18.
 */
public class ApartmentFactory implements HomeAbstractFactory {

    @Override
    public Home createHome(Integer homeType) {
        switch (homeType) {
            case 1:
                return new SimpleApartment();
            case 2:
                return new LuxuryApartment();
            default:
                return null;
        }
    }
}
