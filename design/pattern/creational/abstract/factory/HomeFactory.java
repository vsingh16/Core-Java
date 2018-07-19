package com.company.design.pattern.creational.abstactt.factory;

/**
 * Created by vishal on 07-Apr-18.
 */
public class HomeFactory {

    public static Home create(HomeAbstractFactory homeAbstractFactory,Integer type){
        return homeAbstractFactory.createHome(type);
    }
}
