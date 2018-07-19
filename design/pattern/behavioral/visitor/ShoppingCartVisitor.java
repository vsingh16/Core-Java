package com.company.design.pattern.behavioral.visitor;

/**
 * Created by vishal on 13-Apr-18.
 */
public class ShoppingCartVisitor implements Visitor {

    /**
     * Fruits has discount if price is more than 500
     *
     * @param fruits
     * @return
     */
    @Override
    public Double visit(Fruits fruits) {
        System.out.println("Visiting Fruits");
        return fruits.getPrice() >= 500 ? fruits.getPrice() - fruits.getPrice() * .1 : fruits.getPrice();
    }

    /**
     * Station item has discount of 10%
     */
    @Override
    public Double visit(Stationary stationary) {
        System.out.println("Visiting Stationary");
        return stationary.getPrice() - stationary.getPrice() * .05;
    }
}
