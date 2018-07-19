package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 07-Apr-18.
 * <p>
 * This is similar to eager initilization, it just that due to static blocks we can handle exceptions
 */
public class StaticBlockInitialization {

    private static StaticBlockInitialization staticBlockInitialization;

    static {
        try {
            staticBlockInitialization = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating object");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return staticBlockInitialization;
    }

    private StaticBlockInitialization() {
    }
}
