package com.company.design.pattern.creational.singleton;

import java.io.*;

/**
 * Created by vishal on 07-Apr-18.
 */
public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private static class SingletonHelper {
        private static SerializableSingleton serializableSingleton = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.serializableSingleton;
    }

    private SerializableSingleton() {

    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instance1 = SerializableSingleton.getInstance();
        //serializing to file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(instance1);
        out.close();

        //deserializing
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
        SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
        in.close();
        /**
         * compare instance1 and instance2, both have different hashcode
         * This is because while deserializing it creates new object everytime,
         * TO fix this we need to implement readResolve() method which will be called on ivocation of readObject().
         */
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }

    //uncomment below method to fix this
    /*private Object readResolve() {
        return getInstance();
    }
*/

}
