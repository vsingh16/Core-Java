package com.company.design.pattern.structral.adapter;

/**
 * Created by vishal on 09-Apr-18.
 */
public class CoolerAdapter implements ACRemote {

    private CoolerRemote coolerRemote;

    public CoolerAdapter(CoolerRemote coolerRemote) {
        this.coolerRemote = coolerRemote;
    }

    @Override
    public void increaseTemperature() {
        coolerRemote.rotateToNextLevel();
    }
}
