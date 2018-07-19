package com.company.design.pattern.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vishal on 13-Apr-18.
 */
public class MyTopic implements Subject {

    private Set<Observer> observerList;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observerList = new HashSet<>();
    }

    @Override
    public synchronized void register(Observer obj) {

        observerList.add(obj);

    }

    @Override
    public synchronized void unregister(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public synchronized void notifyObservers() {

        if (changed) {
            this.changed = false;
            observerList.stream().forEach(observer -> {
                observer.update();
            });
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return message;
    }

    public void postMessage(String message) {
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
