package com.company.design.pattern.creational.factory;

import java.util.Scanner;

/**
 * Adavnatge of factory Design pattern is that object creation details is hidden from client.
 * Client only needs to tell type of oject, it will be created by factory.
 * <p>
 * If we don't implement it using factory then we have to do all if else clause stuff in client itself.
 * and in that case if any new oject type is introduced then I have to make that change in all clients code.
 * But with factory that change will be introduced in factory only.
 */
public class Client {


    public static void main(String[] args) {

        System.out.println("Select from below available house options:");
        System.out.println(Constants.APARTMENT);
        System.out.println(Constants.FLAT);
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        House house = HouseFactory.getHouse(choice);
        System.out.println(house);
        /** Output:
         * Select from below available house options:
         APARTMENT
         FLAT
         FLAT
         House{floor='marble', kitchen='modular', balcony='small'}
         */

    }
}
