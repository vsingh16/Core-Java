package com.company.design.pattern.creational.singleton;

/**
 * This singleton approach is thread safe but the problem is since we
 * have synchronized method , so every time all thread will wait for lock
 * to get instance reference.
 * <p>
 * Though thread safety we only need to ensure while creation of object
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    public synchronized static ThreadSafeSingleton getInstance() {

        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }

        return threadSafeSingleton;
    }

    private ThreadSafeSingleton() {

    }
}
