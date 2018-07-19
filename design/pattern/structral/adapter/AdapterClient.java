package com.company.design.pattern.structral.adapter;

/**
 * Created by vishal on 09-Apr-18.
 * <p>
 * Adapter design pattern is a structural design pattern.
 * Structural design pattern modifies the structure of a class or interface.
 * <p>
 * Adapter is used when we have a object of certain type but we wish it to have functionality of another interface type.
 * eg:List list = Arrays.asList(array object).
 * <p>
 * Here we have array object but we want to use get(), add() or remove() methods on it.
 */
public class AdapterClient {

    public static void main(String[] args) {
        CoolerRemote coolerRemote = new CoolerRemoteImpl();

        /**
         * We have object of cooler but we can use increaseTemperature() provided by AC.
         */
        CoolerAdapter coolerAdapter = new CoolerAdapter(coolerRemote);
        coolerAdapter.increaseTemperature();

    }
}
