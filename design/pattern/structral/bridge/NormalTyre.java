package com.company.design.pattern.structral.bridge;

/**
 * Created by vishal on 10-Apr-18.
 */
public class NormalTyre implements Tyre {
    @Override
    public int maxSpeed() {
        return 60;
    }
}
