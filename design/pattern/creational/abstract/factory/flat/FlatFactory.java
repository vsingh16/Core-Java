package com.company.design.pattern.creational.abstactt.factory.flat;

import com.company.design.pattern.creational.abstactt.factory.Home;
import com.company.design.pattern.creational.abstactt.factory.HomeAbstractFactory;

/**
 * Created by vishal on 07-Apr-18.
 */
public class FlatFactory implements HomeAbstractFactory {
    @Override
    public Home createHome(Integer homeType) {
        switch (homeType) {
            case 1:
                return new OneBHK();
            case 2:
                return new TwoBHK();
            default:
                return null;
        }
    }
}
