package com.company.design.pattern.creational.singleton;

/**
 * Created by vishal on 05-Apr-18.
 * Singleton Pattern ensures, that the single instance of a class exists in JVM.
 * <p>
 * In Eager initialization, object is created while class loading, so
 * this approach is thread safe.
 * <p>
 * But the drawback is object exists even no object creation request is made.
 * So we can use this if we are sure that we will be needing the object and
 * object creation cost is not much.
 * <p>
 * java.lang.Runtime uses this approach to create Runtime object
 * as for JVM we definitely have the Runtime info.
 *
 *
 * Some common Singleton Use Cases:
 *
 * 1)If we have cache object, we can make it singleton, so that it can have global points of reference
 * and all future calls to cache object, will use in memory object and not create new cache object.
 *
 * 2)In Spring, DAO layer , controllers we create singleton objects for all of them.
 *
 * 3)Configuration Files or Property Files, we can create Singleton object for them too as they also require
 * common global access.
 *
 * 4)Logger:Each logger class object has a file corresponding to it.
 * In case if we have multiple objects, then it may be the case we have two logger
 * object writing to same file further causing inconsistency.
 *
 */
public class EagerInitialization {

    private static EagerInitialization eagerInitialization = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }

    private EagerInitialization() {

    }
}
