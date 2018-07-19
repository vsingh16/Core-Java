package com.company.design.pattern.structral.adapter;

/**
 * Created by vishal on 09-Apr-18.
 */
public class ACRemoteImpl implements ACRemote {

    @Override
    public void increaseTemperature() {
        System.out.println("AC remote temp increased.");
    }

}
