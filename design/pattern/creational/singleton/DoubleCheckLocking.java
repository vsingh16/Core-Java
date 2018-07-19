package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 07-Apr-18.
 * <p>
 * This is called double check locking, as we have two checks.
 * one before synchronized block and one after this.
 * <p>
 * We need two locks because if two threads executes the first check simultaneously
 * and bot are waiting for lock , so one will get at a time and this will create object
 * and after this when second thread gets the lock if it does not check, it will also create two locks.
 * <p>
 * Volatile keyword is necessary to ensure second thread don't see dirty value but the value from
 * main memory.(happens before relationship)
 * <p>
 * This is better than having synchronization at method level becuase if object exists in
 * system, we don't need to have lock.
 *
 * There is a issue with double check locking, that u have to use volatile keyword else threads may see half initialized
 * state of an object.
 *
 * volatile keyword was introduces in java 1.5 so lower versions dont have this.
 */
public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking doubleCheckLocking;

    public static DoubleCheckLocking getInstance() {

        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }

        return doubleCheckLocking;
    }

    private DoubleCheckLocking() {
    }
}
