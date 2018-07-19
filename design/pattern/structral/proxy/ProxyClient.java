package com.company.design.pattern.structral.proxy;

/**
 * Created by vishal on 09-Apr-18.
 *
 * Proxy design pattern is used when we want to change the behaviour of a class.
 * either want to restrict the access or improve the functionality.
 *
 * eg Spring AOP , @Before or @After.
 * A proxy object is created which will override the class method and incorporate before and after method.
 *
 * or we have a command class whihc can run any command and we want to share it with client we will
 * share the proxied version with limited access and few checks.
 *
 * Collections.synchronizedList() is also example of proxy.
 * This method creates proxy by creating a class where it overwrites all list method
 * with synchronized keyword.
 */
public class ProxyClient {

    public static void main(String[] args) {
        Internet realInternet = new RealInternet();
        realInternet.connect("danger.com");//connect

        Internet proxyInternet = new ProxyInternet();
        proxyInternet.connect("danger.com");//throws excpetion
    }
}
