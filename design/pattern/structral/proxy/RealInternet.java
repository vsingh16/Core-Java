package com.company.design.pattern.structral.proxy;

/**
 * Created by vishal on 09-Apr-18.
 */
public class RealInternet implements Internet {

    @Override
    public void connect(String server) {
        System.out.println("Connected to " + server);
    }
}
