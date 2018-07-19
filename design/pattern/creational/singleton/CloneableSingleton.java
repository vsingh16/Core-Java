package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 19-Jul-18.
 * <p>
 * If parent class is cloneable chld also become cloenable.
 * And Sicne java internally creates object for clone() methods, we will have different object
 * everytime we clone.
 *
 * To fix this throw CloneNotSupportedException exception from child's(Singleton) clone method.
 */
public class CloneableSingleton {

    class Parent implements Cloneable {

        int i = 10;

        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    //Singleton class
    class Child extends Parent {
        Child instance = new Child();

        private Child() {
            // private constructor
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }
}
