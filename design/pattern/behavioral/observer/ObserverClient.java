package com.company.design.pattern.behavioral.observer;

/**
 * Created by vishal on 13-Apr-18.
 * It is used when we want to get notified about any changes in an object state.
 * The objects waiting for notification is called observer and the object whose state they are
 * interested is called Subject.
 * <p>
 * Java provides observable and observer interface in java.util but this is not widely used as its
 * implementation is quites simple.
 * <p>
 * JMS listenres or any other event listeners are example of this.
 * Youtube subscribe and notified model is also an example of this.
 */
public class ObserverClient {

    public static void main(String[] args) {

        //create Subject
        MyTopic myTopic = new MyTopic();
        //create Observers
        Observer observer1 = new MyTopicSubscriber("Listener 1");
        Observer observer2 = new MyTopicSubscriber("Listener 2");
        Observer observer3 = new MyTopicSubscriber("Listener 3");

        myTopic.register(observer1);
        myTopic.register(observer2);
        myTopic.register(observer3);

        observer1.setSubject(myTopic);
        observer2.setSubject(myTopic);
        observer3.setSubject(myTopic);

        //listen from topic
        observer1.update();

        //send message to topic
        myTopic.postMessage("Hello Brother");


    }
}
