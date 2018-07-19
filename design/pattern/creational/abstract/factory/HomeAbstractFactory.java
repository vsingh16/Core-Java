package com.company.design.pattern.creational.abstactt.factory;

/**
 * Created by vishal on 07-Apr-18.
 * <p>
 * Abstract factory is factory of factory.
 * Client will be needing object from one of Factory.
 * <p>
 * //Example of Abstract Factory and Factory design pattern  in Java
 * DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
 * DocumentBuilder factory = abstractFactory.newDocumentBuilder();
 * Document doc = factory.parse(stocks)
 * <p>
 */
public interface HomeAbstractFactory {

    Home createHome(Integer homeType);

}
