package com.company.design.pattern.behavioral.visitor;

/**
 * Created by vishal on 13-Apr-18.
 */
public class Stationary implements Item {

    private Double price;

    public Stationary(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
