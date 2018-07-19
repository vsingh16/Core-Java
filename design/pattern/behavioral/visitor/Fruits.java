package com.company.design.pattern.behavioral.visitor;

/**
 * Created by vishal on 13-Apr-18.
 */
public class Fruits implements Item {

    private Double price;

    public Fruits(Double price) {
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
