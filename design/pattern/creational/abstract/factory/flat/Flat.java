package com.company.design.pattern.creational.abstactt.factory.flat;

import com.company.design.pattern.creational.abstactt.factory.Home;

/**
 * Created by vishal on 07-Apr-18.
 */
public class Flat extends Home {

    private Integer balcony;

    public Flat(Integer balcony, Integer roomCount) {
        super(roomCount);
        this.balcony = balcony;
    }
}
