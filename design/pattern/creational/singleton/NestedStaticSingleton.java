package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 07-Apr-18.
 * <p>
 * This approach is also known as Bill pugh.
 * <p>
 * Inner class is not loaded while loading outer class.
 * Inner class is loaded on first invocation of getInstance() method which will create the object.
 *
 * The double check lock may have some issues due to thread race but this apprach does not requires
 * synchronization and also have lazy initialization
 *
 * PS:Singleton design pattern can be broken any time with reflection.
 * As with reflection, we can make private constructor public with setAccessible(true)
 * and then create multiple objects.
 *
 * To avoid reflection problem, we can create Singletons with enum as they provide inbuilt Singleton support.
 */
public class NestedStaticSingleton {

    private static class SingletonHelper {
        private static NestedStaticSingleton nestedStaticSingleton = new NestedStaticSingleton();
    }

    public static NestedStaticSingleton getInstance() {
        return SingletonHelper.nestedStaticSingleton;
    }


    private NestedStaticSingleton() {
    }

}
