package com.company.design.pattern.creational.factory;

/**
 * Created by vishal on 07-Apr-18.
 *
 * In factory design pattern, super class can be interface,abstract class or class itself.
 */
public class House {

    private String floor;
    private String kitchen;
    private String balcony;

    public House() {
    }

    public House(String floor, String kitchen, String balcony) {
        this.floor = floor;
        this.kitchen = kitchen;
        this.balcony = balcony;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", balcony='" + balcony + '\'' +
                '}';
    }
}
