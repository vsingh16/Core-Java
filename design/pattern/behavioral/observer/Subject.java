package com.company.design.pattern.behavioral.observer;

/**
 * Created by vishal on 13-Apr-18.
 */
public interface Subject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();

    //This is to send update about subject
    Object getUpdate(Observer obj);
}
