package com.company.design.pattern.behavioral.observer;

/**
 * Created by vishal on 13-Apr-18.
 */
public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println("No New Message");
        } else {
            System.out.println("Message Received :" + msg);
        }
    }
}
