package com.company.design.pattern.creational.builder;

/**
 * Created by vishal on 07-Apr-18.
 *
 * Builder design pattern is used when we have too many properties of an object.
 * To solve this we can initialize mandatory properties in constructor and remaining in setter.
 * But problem with this is we dont get completely initialized object in one go.
 *
 * To fix this we create a nested static class name as Builder.
 * Which will have same properties as outer class.
 * Constructor initializes mandatory properties.
 * Settter for non mandatory props.
 *
 * build() method is there
 */
public class Home {

    //mandatory params
    private int roomCount;
    private int bathroomCount;

    //optional
    private int parkingCount;
    private int balconyCount;

    private Home(HomeBuilder homeBuilder) {

        this.roomCount = homeBuilder.roomCount;
        this.bathroomCount = homeBuilder.bathroomCount;
        this.balconyCount = homeBuilder.balconyCount;
        this.parkingCount = homeBuilder.parkingCount;
    }

    @Override
    public String toString() {
        return "Home{" +
                "roomCount=" + roomCount +
                ", bathroomCount=" + bathroomCount +
                ", parkingCount=" + parkingCount +
                ", balconyCount=" + balconyCount +
                '}';
    }

    public static class HomeBuilder {

        private int roomCount;
        private int bathroomCount;

        private int parkingCount;
        private int balconyCount;

        public HomeBuilder(int roomCount, int bathroomCount) {
            this.roomCount = roomCount;
            this.bathroomCount = bathroomCount;
        }

        public HomeBuilder setParkingCount(int parkingCount) {
            this.parkingCount = parkingCount;
            return this;
        }

        public HomeBuilder setBalconyCount(int balconyCount) {
            this.balconyCount = balconyCount;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }

    public static void main(String[] args) {
        Home home = new Home.HomeBuilder(2, 1).setBalconyCount(1).build();
        System.out.println(home);
    }

}
