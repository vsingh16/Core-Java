package com.company.design.pattern.behavioral.observer;

/**
 * Created by vishal on 13-Apr-18.
 */
public interface Observer {

    void setSubject(Subject subject);
    //this is to update observer, used by subject
    void update();
}
