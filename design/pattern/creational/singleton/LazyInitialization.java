package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 07-Apr-18.
 * Here object is created after checking if instance is not already exists.
 * Problem with below is if two threads executes the same code simultaneously,
 * both will see lazyInitialization == null  and creates two object
 */
public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    public static LazyInitialization getInstance() {

        if (lazyInitialization == null) {
            new LazyInitialization();
        }

        return lazyInitialization;
    }

    private LazyInitialization() {
    }
}
