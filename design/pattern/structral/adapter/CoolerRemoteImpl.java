package com.company.design.pattern.structral.adapter;

/**
 * Created by vishal on 09-Apr-18.
 */
public class CoolerRemoteImpl implements CoolerRemote {

    @Override
    public void rotateToNextLevel() {
        System.out.println("Cooler button rotated to next level");
    }
}
