package com.company.design.pattern.behavioral.visitor;

/**
 * Created by vishal on 13-Apr-18.
 */
public interface Visitor {

    Double visit(Fruits fruits);

    Double visit(Stationary stationary);

}
